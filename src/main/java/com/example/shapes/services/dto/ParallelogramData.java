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
public class ParallelogramData extends TrapeziumData {
	
	private final Double width;
	private final Double height;
	private final Double angle;
	
	public ParallelogramData(Double width, Double height, Double angle){
		this.width = width;
		this.height = height;
		this.angle = angle;
	}

	public ParallelogramData(){
		this(3.0,2.0, 45.0);
	}
	
	@Override
	public Double computeArea() {
		return 1.0;
	}
	
}
