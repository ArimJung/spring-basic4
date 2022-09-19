package com.kim.biz.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping { // 싱글톤 패턴이 유지됨
	// input : 어떤 요청에 대해 == String
	// output : 무슨 컨트롤러 객체를 제공해야하 하는지 == 컨트롤러
	
	private Map<String,Controller> mappings; // 의존관계 -> DI => 생성자 주입
	
	public HandlerMapping() {
		mappings=new HashMap<String,Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/main.do", new MainController());
	}
	
	// 사용가 어떤 요청을 했는지 보고서 어떤 컨트롤러 객체를 반환해야하는지
	public Controller getController(String command) {
		return mappings.get(command);
	}
}
