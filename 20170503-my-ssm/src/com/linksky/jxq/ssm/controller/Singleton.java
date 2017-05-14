package com.linksky.jxq.ssm.controller;

import java.util.Map;

public class Singleton {
//	private static Singleton sin = new Singleton();  //饿汉模式
	private static Singleton sin = null;
	private static Map map;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if (sin == null){
			sin = new Singleton();//懒汉
		}
		return sin;
	}

	public static Map getMap() {
		return map;
	}

	public static void setMap(Map map) {
		Singleton.map = map;
	}
}
