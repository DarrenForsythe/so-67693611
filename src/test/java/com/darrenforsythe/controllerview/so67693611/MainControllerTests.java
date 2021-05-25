package com.darrenforsythe.controllerview.so67693611;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
class MainControllerTests {

	private final MockMvc mockMvc;

	@Autowired
	MainControllerTests(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}

	@Test
	void testViewShouldBeReturned() throws Exception {
		mockMvc.perform(get("/testing"))
				.andExpect(status().isOk())
				.andExpect(view().name("test"))
				.andExpect(model().attribute("firstName", "John"))
				.andExpect(model().attribute("number", 42));

	}
}
