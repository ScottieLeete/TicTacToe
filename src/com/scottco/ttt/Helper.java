package com.scottco.ttt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {

	public static String readln(String line) {
		System.out.println(line);
		return readln();
	}
	
	public static String readln() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			return s;
		} catch (IOException e) {
			return "";
		}
	}
}
