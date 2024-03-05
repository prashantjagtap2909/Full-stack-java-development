package com;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Bank extends Thread{
	
	private String name;
    private static int balance = 1500;

    public Bank(String name) {
        this.name = name;
    }

    private String generateTransactionId() {
        StringBuilder transactionId = new StringBuilder();
        for (int i = 0; i < 10; i++) { 
            transactionId.append(ThreadLocalRandom.current().nextInt(0, 10)); 
        }
        return transactionId.toString();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String transactionId = generateTransactionId();
            try {
            	withdraw(200, transactionId);
                writeTransactionToFile(name, transactionId, balance); 
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }
    
    private synchronized void withdraw(int amount, String transactionId) {
        if (balance >= amount && balance >= 100) {
            balance -= amount;
            System.out.println(name + "  (" + transactionId + "): Remaining balance = " + balance);
            
        } else {
            System.out.println(name + ": Insufficient funds.....!");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }
    
    private synchronized void writeTransactionToFile(String bankName, String transactionId, int balance) throws IOException {
        
        File file = new File("D:\\transactions.txt");
        FileWriter writer = new FileWriter(file, true); 

        try {
           
            writer.write(String.format("%s (%s) - Remaining balance: %d\n", bankName, transactionId, balance));
            writer.flush();
            System.out.println("Transaction details written to file successfully.");
        } finally {
            writer.close();
        }
    }
}
