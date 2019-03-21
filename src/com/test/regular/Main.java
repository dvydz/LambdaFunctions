package com.test.regular;

public class Main {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	
	public static void main(String[] args) {
		Main obj=new Main();		
		Greeting innerClassGreeting=new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello World!");	
			}
		};
		obj.greet(innerClassGreeting);

		Greeting myLambdaFunction=() -> System.out.println("Hello lambda !");
		obj.greet(myLambdaFunction);
	}
}
