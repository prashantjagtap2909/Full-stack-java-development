package com;
import java.util.Date;

public class Trigger {

	public static void main(String args[]) {
		
		System.out.println(Thread.currentThread().getName());

        Date d = new Date();

        
        @SuppressWarnings("deprecation")
		Bank b1 = new Bank("Online Transaction_UPI_PAYMENT   " + d.toLocaleString());
        @SuppressWarnings("deprecation")
		Bank b2 = new Bank("BOB ATM at Shirur ST STAND 032   " + d.toLocaleString());

       
        Thread thread1 = new Thread(b1);
        Thread thread2 = new Thread(b2);

        thread1.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread2.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}