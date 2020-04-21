package com.st.satya;

public class StringReverse {

	public static void main(String[] args) {
		String str= "Satyajit";
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
			System.out.println(sb);
		}
	}

