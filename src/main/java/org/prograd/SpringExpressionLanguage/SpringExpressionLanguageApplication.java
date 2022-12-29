package org.prograd.SpringExpressionLanguage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringExpressionLanguageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringExpressionLanguageApplication.class, args);
		System.out.println("Enter the number to check");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		OddOrEven obj = context.getBean(OddOrEven.class);
		obj.isOddOrEven(number);
		PrimeOrComposite obj1 = context.getBean(PrimeOrComposite.class);
		obj1.isPrimeOrComposite(number);
		SquareOrCube obj2 = context.getBean(SquareOrCube.class);
		obj2.isSquareOrCube(number);
	}

}
