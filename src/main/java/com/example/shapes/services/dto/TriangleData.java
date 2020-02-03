/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.services.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author janschnegotzki
 */
public class TriangleData extends ShapeData{
	
	private Double alpha;
	private Double beta;
	private Double gamma;
	
	@Override
	public Requirements getRequirements() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Double getArea() {
		return 1.0;
	}
}
