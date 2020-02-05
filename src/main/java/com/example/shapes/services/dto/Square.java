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
public class Square extends Rectangle{
	
	public Square(Double sideLength){
		super(sideLength, sideLength);
	}
	
	public Square(){
	this(1.0);
	}

		@Override
	public Square withParameters(Map<String,Double> parameters){
		return new Square(parameters.get("sideLength"));
	}
}
