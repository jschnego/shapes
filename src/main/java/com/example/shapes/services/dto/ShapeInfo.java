/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.services.dto;

import java.util.List;
import java.util.Map;

/**
 *
 * @author janschnegotzki
 */
public class ShapeInfo {
	
	private String name;
	private Double area;
	private Map<String,Double> parameters;
	private List<String> hierarchy;

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public void setParameters(Map<String, Double> parameters) {
		this.parameters = parameters;
	}

	public void setHierarchy(List<String> hierarchy) {
		this.hierarchy = hierarchy;
	}

	public String getName() {
		return name;
	}

	public Double getArea() {
		return area;
	}

	public Map<String, Double> getParameters() {
		return parameters;
	}

	public List<String> getHierarchy() {
		return hierarchy;
	}

	
}
