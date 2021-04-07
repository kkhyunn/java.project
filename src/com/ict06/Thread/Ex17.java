package com.ict06.Thread;

import java.util.ArrayList;
import java.util.List;

public class Ex17 {
	// 컬렉션 : 자동차들을 저장하는 저장창고
	private List<String> carList = null;
	
	// 생성자 : 해당 클래스가 객체로 생성되면 carList를 생성한다.
	public Ex17() {
		carList = new ArrayList<String>();
	}
	
	// 자동차 생산
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) {
			case 0 : carName = "SM5"; break;
			case 1 : carName = "매그너스"; break;
			case 2 : carName = "카렌스"; break;
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("차가 없어요 생산할 때까지 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String)carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다. 손님이 구입한 차이름은 =>\" " + carName + "\"");
		return carName;
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다. 차이름은 \" " + car +"\"");
		if (carList.size() == 5) {
			this.notify();
		}
	}
}
