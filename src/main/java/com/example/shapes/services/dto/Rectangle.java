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
public class Rectangle extends Parallelogram{
	
	public Rectangle(Double width, Double height){
		super(width, height, 90.0);
	}
	
	public Rectangle(){
		this(3.0, 2.0);
	}

	@Override
	public Double computeArea(){
		return width * height;
	}
	
	@Override
	public Rectangle withParameters(Map<String,Double> parameters){
		return new Rectangle(parameters.get("width"), parameters.get("height"));
	}
	
}
