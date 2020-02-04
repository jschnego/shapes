/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services;

import com.example.shapes.Shapes;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author janschnegotzki
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Shapes.class)
public class ShapeServiceTest {
	
	@Autowired
	ShapeService shapeService;
	
	@Test
	public void basicRequirementsShouldBeOutput() {
		Map<String, List<String>> requirements = shapeService.getAllRequirements();
		
		assertThat(requirements.get("triangle").size()).isEqualTo(3);
		assertThat(requirements.get("trapezium").size()).isEqualTo(4);
		assertThat(requirements.get("parallelogram").size()).isEqualTo(3);
		assertThat(requirements.get("rectangle").size()).isEqualTo(2);
		assertThat(requirements.get("square").size()).isEqualTo(1);
		assertThat(requirements.get("rhombus").size()).isEqualTo(2);
		assertThat(requirements.get("ellipse").size()).isEqualTo(2);
		assertThat(requirements.get("circle").size()).isEqualTo(1);
		assertThat(requirements.get("kite").size()).isEqualTo(3);
	}

	@Test
	public void hierarchiesShouldBeRetrievedCorrectly(){
		assertThat(shapeService.getHierarchy("triangle").size()).isEqualTo(2);
		assertThat(shapeService.getHierarchy("trapezium").size()).isEqualTo(2);
		assertThat(shapeService.getHierarchy("parallelogram").size()).isEqualTo(3);
		assertThat(shapeService.getHierarchy("rectangle").size()).isEqualTo(4);
		assertThat(shapeService.getHierarchy("square").size()).isEqualTo(5);
		assertThat(shapeService.getHierarchy("rhombus").size()).isEqualTo(4);
		assertThat(shapeService.getHierarchy("ellipse").size()).isEqualTo(2);
		assertThat(shapeService.getHierarchy("circle").size()).isEqualTo(3);
		assertThat(shapeService.getHierarchy("kite").size()).isEqualTo(2);
	}
	
}
