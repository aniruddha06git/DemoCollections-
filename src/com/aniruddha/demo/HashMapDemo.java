package com.aniruddha.demo;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"Aniruddha");
		map.put(102,"Samrat");
		map.put(103,"Shakya");
		System.out.println(map);
	}

}
