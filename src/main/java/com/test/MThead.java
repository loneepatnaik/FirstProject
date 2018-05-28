package com.test;

public class MThead implements Runnable {
	
	public void run() {
		 
		for(int i=2;i<100;i++){
            int count=1;
            for(int j=2;j<i;j++){
                if(i%j ==0){
                    count=0;
                    break;
                }

            }if(count==1){
                System.out.println("thread"+Thread.currentThread().getName()+" "+ i);
            }

		
			 }
	}
}
	    

	

