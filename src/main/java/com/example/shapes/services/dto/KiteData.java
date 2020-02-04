/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services.dto;

import java.util.Arrays;

/**
 *
 * @author janschnegotzki
 */
public class KiteData extends ShapeData{
	
	private final Double lengthA;
	private final Double lengthB;
	private final Double angle;
	
	public KiteData(Double lengthA, Double lengthB, Double angle){
		this.lengthA = lengthA;
		this.lengthB = lengthB;
		this.angle = angle;
	}

	public KiteData(){
		this(2.0, 3.0, 45.0);
	}
	
	@Override
	public Double computeArea() {
		return 1.0;
	}
}
