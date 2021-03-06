package com.ict07.IO;

public class Ex04 {
	// Stream(스트림)
	//  - 데이터를 목적지까지 입/출력 하기 위한 방법
	//  - 데이터를 쓰는 경우 => 출력스트림
	//  - 데이터를 읽는 경우 => 입력스트림
	
	// 스트림의 종류 : 바이트 스트림, 문자스트림, 바이트-문자결합스트림, 오브젝트스트림
	// 1. 바이트 스트림(기계중심) : 모든 처리를 1byte씩 처리
	//    대상 : 1byte로 이루어진 파일들(영상, 소리, 사진 등 모든 파일들을 말한다.)
	//           영문자 대소문자, 숫자를 스트림 할 수 있다. (영어이외의 문자는 안됨)
	//    최상위 클래스 : InputStream(입력), OutputStream(출력)
	
	// 2. 문자 스트림(사람중심) : 모든 처리를 2byte씩 처리 
	//    대상 : 전 세계의 모든 언어로 구성된 문서 파일
	//    최상위 클래스 : Reader(입력),  Writer(출력)
	
	// 3. 바이트-문자결합스트림 : 기계를 통해 입/출력한 정보를 
	//                            사람이 사용할 수 있도록 입/출력
	//    해당 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
	
	// 4. 오브젝트 스트림 : 객체를 직렬화 한 후 객체 단위로 입/출력한다.
	//                      (객체 직렬화)
	//    해당 클래스 : ObjectInputStream(readObject() : 객체 역직렬화 => 받는 쪽(읽기))
	//                  ObjectOutputStream(writeObject() : 객체 직렬화 => 보내는 쪽(쓰기))
	
	
}