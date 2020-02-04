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
public class Ellipse extends Shape{

	protected Double radiusX;
	protected Double radiusY;
	
	public Ellipse(Double radiusX, Double radiusY){
		this.radiusX = radiusX;
		this.radiusY = radiusY;
	}

	public Ellipse(){
		this(3.0, 2.0);
	}
	
	@Override
	public Double computeArea() {
		return Math.PI * radiusX * radiusY;
	}
	
}
