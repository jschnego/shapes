/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import com.example.shapes.Shapes;
import com.example.shapes.services.dto.InfoRequest;
import com.example.shapes.services.dto.ShapeInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author janschnegotzki
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Shapes.class)
@AutoConfigureMockMvc
public class ShapeRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	private ObjectMapper mapper = new Jackson2ObjectMapperBuilder().build();
	private HttpHeaders headers = new HttpHeaders();
	
	@Before
	public void init(){
		headers.add("Content-Type", "application/json");
	}
	
	@Test
	public void availableShapesAndRequirementsShouldBeRetrieved() throws Exception {
		String response = mockMvc.perform(get("/requirements")).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		
		Map<String,List<String>> map = mapper.readValue(response, new TypeReference<Map<String,List<String>>>(){});
		assertThat(map.size()).isEqualTo(9);
	}
	
	@Test
	public void shapeInfoShouldBeReturned() throws Exception {
		Map<String,Double> parameters = new HashMap<String,Double>();
		parameters.put("width", 5.0);
		parameters.put("height", 3.0);

		InfoRequest request = new InfoRequest("rectangle", parameters);
		
		String response = mockMvc.perform(post("/shape-info").headers(headers).content(mapper.writeValueAsString(request))).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		ShapeInfo info = mapper.readValue(response, ShapeInfo.class);

		assertThat(info.getArea()).isEqualTo(15.0);
		assertThat(info.getName()).isEqualTo("rectangle");
		assertThat(info.getParameters()).isEqualTo(parameters);
		assertThat(info.getHierarchy()).containsAll(Arrays.asList(new String[] {"Shape", "Trapezium", "Parallelogram", "Rectangle"}));
	}
	
}
