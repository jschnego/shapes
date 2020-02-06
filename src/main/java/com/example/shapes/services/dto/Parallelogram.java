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
	
	protected final Double width;
	protected final Double height;
	protected final Double angle;
	
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
		return width * height * Math.sin((angle * Math.PI) / 180);
	}
	
	@Override
	public Parallelogram withParameters(Map<String,Double> parameters){
		return new Parallelogram(parameters.get("width"), parameters.get("height"), parameters.get("angle"));
	}
	
}
