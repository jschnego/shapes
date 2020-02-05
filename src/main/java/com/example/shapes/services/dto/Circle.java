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
public class Circle extends Ellipse{
	
	public Circle(Double radius){
		super(radius, radius);
	}
	
	public Circle(){
		this(1.0);
	}

	@Override
	public Circle withParameters(Map<String,Double> parameters){
		return new Circle(parameters.get("radius"));
	}

}
