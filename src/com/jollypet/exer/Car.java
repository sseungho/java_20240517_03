package com.jollypet.exer;

public class Car {
	
	String modelName;
	int modelYear;	// 년식
	private String horsePower;
	String color;
	
	public void printModel() {
		System.out.println("자동차 모델 : " + this.modelName);		
	}

	public Car() {
		System.out.println("Car 클래스 생성자 호출됨!");
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
	}
	

}
