/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.services.dto;

import java.util.Map;

/**
 *
 * @author janschnegotzki
 */
public class Request {
	
	private String name;
	private Map<String,Double> parameters;

	public Request() {
	}

	public Request(String name, Map<String, Double> parameters) {
		this.name = name;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getParameters() {
		return parameters;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParameters(Map<String, Double> parameters) {
		this.parameters = parameters;
	}

}
