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
public class RhombusData extends ParallelogramData{
	
	private final Double sideLength;
	private final Double angle;
	
	public RhombusData(Double sideLength, Double angle){
		this.sideLength = sideLength;
		this.angle = angle;
	}
	public RhombusData(){
		this(1.0, 60.0);
	}
	
	@Override
	public Double computeArea() {
		return 1.0;
	}
}
