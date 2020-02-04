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
public class TrapeziumData extends ShapeData{
	
	private final Double upperWidth;
	private final Double lowerWidth;
	private final Double leftHeight;
	private final Double angle;
	
	public TrapeziumData(Double upperWidth, Double lowerWidth, Double leftHeight, Double angle){
		this.upperWidth = upperWidth;
		this.lowerWidth = lowerWidth;
		this.leftHeight = leftHeight;
		this.angle = angle;
	}

	public TrapeziumData(){
		this(2.0, 3.0, 1.0, 15.0);
	}
	
	
	@Override
	public Double computeArea() {
		return 1.0;
	}
	
}
