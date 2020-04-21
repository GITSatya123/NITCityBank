package com.st.test;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		
		Calendar cal=null;
		int hour=0;
		String msg= null;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		msg="Current time is:"+hour;
		System.out.println(msg);

	}

}
