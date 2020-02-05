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
public class Triangle extends Shape{
	
	private Double alpha;
	private Double leftSide;
	private Double base;
	
	public Triangle(Double alpha, Double leftSide, Double base){
		this.alpha = alpha;
		this.leftSide = leftSide;
		this.base = base;
	}
	
	public Triangle(){
		this(60.0, 60.0, 1.0);
	}
	
	
	@Override
	public Double computeArea() {
		return 0.5 * leftSide * base * Math.sin((alpha * Math.PI)/180);
	}
	
	@Override
	public Triangle withParameters(Map<String,Double> parameters){
		return new Triangle(parameters.get("alpha"), parameters.get("leftSide"), parameters.get("base"));
	}
	
}
