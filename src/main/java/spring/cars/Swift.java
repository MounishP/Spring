package spring.cars;

import org.springframework.stereotype.Component;

import spring.interfaces.Cars;

@Component
public class Swift implements Cars {

	@Override
	public String specs() {
		return "Swift car from maruthi";
	}

}