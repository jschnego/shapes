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
public class EllipseData extends ShapeData{

	private Double radiusX;
	private Double radiusY;
	
	public EllipseData(Double radiusX, Double radiusY){
		this.radiusX = radiusX;
		this.radiusY = radiusY;
	}

	public EllipseData(){
		this(3.0, 2.0);
	}
	
	@Override
	public Double computeArea() {
		return 1.0;
	}
	
}
