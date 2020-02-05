/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services;

import com.example.shapes.Shapes;
import com.example.shapes.db.entities.StoredShape;
import com.example.shapes.services.dto.Request;
import com.example.shapes.services.dto.ShapeInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.data.Offset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
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
	
	@Test
	public void shapeInformationShouldBeProvided(){
		Map<String, Double> parameters = new HashMap<>();
		parameters.put("width", 5.0);
		parameters.put("height", 3.0);
		ShapeInfo info = shapeService.getInfo(new Request("rectangle", parameters));
		
		assertThat(info.getArea()).isEqualTo(15.0);
		assertThat(info.getName()).isEqualTo("rectangle");
		assertThat(info.getParameters()).isEqualTo(parameters);
		assertThat(info.getHierarchy()).containsAll(Arrays.asList(new String[] {"Shape", "Trapezium", "Parallelogram", "Rectangle"}));
		
		parameters = new HashMap<>();
		parameters.put("radius", 2.0);
		info = shapeService.getInfo(new Request("circle", parameters));
		
		assertThat(info.getArea()).isCloseTo(12.566, Offset.offset(0.001));
		assertThat(info.getName()).isEqualTo("circle");
		assertThat(info.getParameters()).isEqualTo(parameters);
		assertThat(info.getHierarchy()).containsAll(Arrays.asList(new String[] {"Shape", "Ellipse", "Circle"}));
		
		parameters = new HashMap<>();
		parameters.put("base", 5.0);
		parameters.put("leftSide", 7.0);
		parameters.put("alpha", 45.0);
		info = shapeService.getInfo(new Request("triangle", parameters));
		
		assertThat(info.getArea()).isCloseTo(12.374, Offset.offset(0.001));
		assertThat(info.getName()).isEqualTo("triangle");
		assertThat(info.getParameters()).isEqualTo(parameters);
		assertThat(info.getHierarchy()).containsAll(Arrays.asList(new String[] {"Shape", "Triangle"}));
	}
	
	@Test
	@Commit
	public void shapesShouldBeStored(){
		Request request = new Request();
		request.setName("triangle");

		Map<String, Double> parameters = new HashMap<>();
		parameters.put("base", 5.0);
		parameters.put("leftSide", 7.0);
		parameters.put("alpha", 45.0);

		request.setParameters(parameters);
		StoredShape shape = shapeService.storeShape(request);

		assertThat(shape.getId()).isNotNull();
		assertThat(shape.getUuid()).isNotNull();
		assertThat(shape.getName()).isEqualTo(request.getName());
		assertThat(shape.getProperties()).isEqualTo(request.getParameters());
	}
	
}
