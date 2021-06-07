package spring;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.interfaces.Cars;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Cars swift = new Swift();
//		Cars corolla = new Corolla();
//		
//		System.out.println(swift.specs());
//		System.out.println(corolla.specs());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.print("Which car you wanna drive?: ");
		String name = sc.next();
		Cars myCar = context.getBean(name,Cars.class);
		System.out.println(myCar.specs());
		context.close();
		sc.close();

	}

}
