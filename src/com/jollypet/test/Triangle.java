package com.jollypet.test;

public class Triangle extends Shape {

	@Override
	public void areaPrint() {
		// TODO Auto-generated method stub
		super.areaPrint(); // 부모 클레스 원본 메소드 호출
		System.out.println(width  * height  * 0.5);	// 오버라이드
	} // Shape 클래스 상속

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름:shape");
//	}

	
//	public void areaPrint() {	// 오버라이딩  -> 삼각형 넓이 출력
//		System.out.println(width  * height  * 0.5);		
//	}
	

	
}
