package com.ict06.Thread;

public class Ex18 implements Runnable {
	private Ex17 car;
	public Ex18(Ex17 car) {
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random() + 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
