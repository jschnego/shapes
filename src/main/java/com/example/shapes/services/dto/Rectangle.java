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
public class Rectangle extends Parallelogram{
	
	public Rectangle(Double width, Double height){
		super(width, height, 90.0);
	}

	public Rectangle(){
		this(3.0, 2.0);
	}
	
}
