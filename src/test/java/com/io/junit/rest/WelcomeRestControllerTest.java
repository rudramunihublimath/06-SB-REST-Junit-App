package com.io.junit.rest;

import com.io.junit.controller.WelcomeRestController;
import com.io.junit.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private WelcomeService welcomeService;

	@Test
	public void test_welcomeMsg() throws Exception {

		when(welcomeService.getWelcomeMSg()).thenReturn("Good morning ");

		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();

		int status = mvcResult.getResponse().getStatus();

		assertEquals(200, status);

	}
}
