/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.services.dto;

/**
 *
 * @author janschnegotzki
 */
public class EllipseData extends ShapeData{

	private Double scalingX;
	private Double scalingY;
	private Double radius;
	
	public EllipseData(Double scalingX, Double scalingY, Double radius){
		this.scalingX = scalingX;
		this.scalingY = scalingY;
		this.radius = radius;
	}

	
	@Override
	public Requirements getRequirements() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Double getArea() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
