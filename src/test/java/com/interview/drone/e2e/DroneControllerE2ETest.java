package com.interview.drone.e2e;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.drone.dto.DroneDto;
import com.interview.drone.entity.DroneState;
import lombok.SneakyThrows;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "e2e")
class DroneControllerE2ETest {

	private MockMvc mockMvc;
	private final ObjectMapper mapper = new ObjectMapper();

	@Autowired
	private WebApplicationContext context;

	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	@SneakyThrows
	@Transactional
	void registerDrone() {
		DroneDto dto = DroneDto.builder()
			.serialNumber("Test")
			.batteryCapacity(100)
			.weightLimit(500)
			.state(DroneState.IDLE)
			.build();
		String json = mapper.writeValueAsString(dto);

		mockMvc.perform(post("/register")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json))
			.andExpect(status().isOk())
			.andExpect(jsonPath("id", Matchers.notNullValue()))
			.andExpect(jsonPath("serialNumber", Matchers.is("Test")))
			.andExpect(jsonPath("batteryCapacity", Matchers.is(100)))
			.andExpect(jsonPath("weightLimit", Matchers.is(500)))
			.andExpect(jsonPath("state", Matchers.is(DroneState.IDLE.name())));
	}



}
