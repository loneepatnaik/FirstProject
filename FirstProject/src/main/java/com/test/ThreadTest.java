package com.test;

import org.joda.time.DateTime;

public class ThreadTest{

	public static void main(String[] args) {
        
		 DateTime dt = new DateTime();
			System.out.println(dt.getDayOfYear());
			try{
			Thread t1 = new Thread(new MThead());
			Thread t2 = new Thread(new MThead());
			t1.start();
			t2.start();
			}catch(Exception e1){ 
				
			}

	}
}
