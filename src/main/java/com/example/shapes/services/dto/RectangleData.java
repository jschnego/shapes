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
public class RectangleData extends ParallelogramData{
	
	public RectangleData(Double width, Double height){
		super(width, height, 90.0);
	}

	public RectangleData(){
		this(3.0, 2.0);
	}
	
}
