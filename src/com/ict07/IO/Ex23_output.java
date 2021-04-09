package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 객체 직렬화 : ObjectOutputStream : writeObject()
public class Ex23_output {
	public static void main(String[] args) {
		// 객체 직렬화 : 특정 클래스(VO)를 객체로 만들 특정위치에 .ser로 만들어 저장한다.
		//				 객체들이 가지고 있는 내용이 직렬화 되어 있다.(사람은 정보를 제대로 볼 수 없다.)
		
		String pathname = "c:" + File.separator + "Study" + File.separator 
				+ "Util" + File.separator + "ict07.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화를 하기 위한 객체를 만듦
			Ex23_VO vo = new Ex23_VO("둘리", 28, 67.3, true);
			
			// 객체 직렬화
			oos.writeObject(vo);
			oos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
