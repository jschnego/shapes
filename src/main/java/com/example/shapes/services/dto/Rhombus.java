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
public class Rhombus extends Parallelogram{
	
	public Rhombus(Double sideLength, Double angle){
		super(sideLength, sideLength, angle);
	}
	public Rhombus(){
		this(1.0, 60.0);
	}
	
	@Override
	public Double computeArea(){
	return width * width * Math.sin((angle * Math.PI) / 180);	
	}
	
	@Override
	public Rhombus withParameters(Map<String,Double> parameters){
		return new Rhombus(parameters.get("sideLength"), parameters.get("angle"));
	}
	
}
