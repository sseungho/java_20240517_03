package com.jollypet.test;

public class Shape {

	int width = 10;
	int height = 20;
	
	
	public void areaPrint() {
		System.out.println(this.width * this.height);
	}
	public final void namePrint() { // final 메소드 선언이 추가되면 해당 메소드는 오버라이드 불가능!
		System.out.println("도형이름:shape");
	}
}
