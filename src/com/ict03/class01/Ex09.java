package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	// 이름받기 : setName을 통해서 받으면 된다.
	
	// 총점 구하기
	public void p_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		p_avg();
	}
	
	// 평균 구하기
	public void p_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
		p_hak();
	}
	
	// 학점 구하기
	public void p_hak() {
		if (avg >= 90) hak = "A";
		else if (avg > 80) hak = "B";
		else if (avg > 70) hak = "C";
		else hak = "F";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
