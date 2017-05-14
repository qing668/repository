package com.linksky.jxq.ssm.controller;

import java.util.Map;

public class Singleton {
	private static Singleton sin = new Singleton();
	private static Map map;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return sin;
	}

	public static Map getMap() {
		return map;
	}

	public static void setMap(Map map) {
		Singleton.map = map;
	}
}
