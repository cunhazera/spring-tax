package com.money;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.money.application.TaxApplication;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = TaxApplication.class)
public class TaxApplicationTestsNo {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void init() {
		mockMvc = webAppContextSetup(webApplicationContext).build();
	}

//	@Test
	public void testStatusRequest() throws Exception {
		MockHttpServletResponse response = mockMvc.perform(get("/api/status")).andReturn().getResponse();
		assertThat(response.getContentAsString(), equalTo("OK"));
		assertThat(response.getStatus(), is(200));
	}

}
