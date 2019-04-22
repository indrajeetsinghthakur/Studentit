package com.it;



public class MainClass {
	public static void main(String[] args) {
		
	
		String s = "indrajeet";
		char[] ch = s.toCharArray();
		
		byte[] by1 = Base64Class.base64Decode(ch, 0, 2);
		for (byte by : by1) {
			System.out.println(by);
		}
	}
}
