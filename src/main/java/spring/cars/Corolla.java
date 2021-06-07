package spring.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.interfaces.Cars;

@Component
public class Corolla implements Cars {
	
	@Autowired
	Engine engine;

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		String specs = "Corolla car from maruthi with engine type: "+ engine.specs();
		return specs;
	}

}
