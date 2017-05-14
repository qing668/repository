package com.txx;

import java.util.HashMap;
import java.util.Map;

import com.linksky.jxq.ssm.controller.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance);
		System.out.println(instance2);
		Map map = new HashMap();
		map.put("a", 111111111111111111);
		map.put("b", 22);
		instance.setMap(map);
		
		System.out.println(instance2.getMap().get("a"));
	}
}
