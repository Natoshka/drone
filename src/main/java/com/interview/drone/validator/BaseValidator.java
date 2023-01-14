package com.interview.drone.validator;

public interface BaseValidator<E> {

    void validate(E entity);
}
