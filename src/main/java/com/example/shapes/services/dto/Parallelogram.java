/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services.dto;

import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author janschnegotzki
 */
public class Parallelogram extends Trapezium {
	
	private final Double width;
	private final Double height;
	private final Double angle;
	
	public Parallelogram(Double width, Double height, Double angle){
		this.width = width;
		this.height = height;
		this.angle = angle;
	}
	
	public Parallelogram(){
		this(3.0,2.0, 45.0);
	}
	
	@Override
	public Double computeArea() {
		return width * height;
	}
	
	@Override
	public Parallelogram withParameters(Map<String,Double> parameters){
		return new Parallelogram(parameters.get("width"), parameters.get("height"), parameters.get("angle"));
	}
	
}
