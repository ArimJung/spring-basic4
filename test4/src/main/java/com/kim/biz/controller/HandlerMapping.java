package com.kim.biz.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping { // �̱��� ������ ������
	// input : � ��û�� ���� == String
	// output : ���� ��Ʈ�ѷ� ��ü�� �����ؾ��� �ϴ��� == ��Ʈ�ѷ�
	
	private Map<String,Controller> mappings; // �������� -> DI => ������ ����
	
	public HandlerMapping() {
		mappings=new HashMap<String,Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/main.do", new MainController());
	}
	
	// ��밡 � ��û�� �ߴ��� ���� � ��Ʈ�ѷ� ��ü�� ��ȯ�ؾ��ϴ���
	public Controller getController(String command) {
		return mappings.get(command);
	}
}
