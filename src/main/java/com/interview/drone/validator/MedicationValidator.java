package com.interview.drone.validator;

import com.interview.drone.entity.Medication;
import com.interview.drone.exception.MedicationModelException;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

import static java.util.Objects.nonNull;

@Component
public class MedicationValidator implements BaseValidator<Medication> {

    private static final Pattern COMPILED_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_-]*$");
    private static final Pattern COMPILED_CODE_PATTERN = Pattern.compile("^[a-zA-Z0-9_]*$");
    private static final Pattern COMPILED_BASE64_PATTERN = Pattern.compile("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$");

    public void validate(Medication medication) {
        if (nonNull(medication.getId())) {
            throw new MedicationModelException("The id should be generated on server side and cannot be passed from ui");
        }
        if (nonNull(medication.getImage()) && !COMPILED_BASE64_PATTERN.matcher(medication.getImage()).matches()) {
            throw new MedicationModelException("The base64 image is not valid");
        }
        if (nonNull(medication.getName()) && !COMPILED_NAME_PATTERN.matcher(medication.getName()).matches()) {
            throw new MedicationModelException("The name contains invalid symbols");
        }
        if (nonNull(medication.getCode()) && !COMPILED_CODE_PATTERN.matcher(medication.getCode()).matches()) {
            throw new MedicationModelException("The code contains invalid symbols");
        }
    }
}
