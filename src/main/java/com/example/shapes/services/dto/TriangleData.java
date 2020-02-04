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
public class TriangleData extends ShapeData{
	
	private Double alpha;
	private Double beta;
	private Double base;
	
	public TriangleData(Double alpha, Double beta, Double base){
		this.alpha = alpha;
		this.beta = beta;
		this.base = base;
	}

	public TriangleData(){
		this(60.0, 60.0, 1.0);
	}


	@Override
	public Double computeArea() {
		return 1.0;
	}
}
