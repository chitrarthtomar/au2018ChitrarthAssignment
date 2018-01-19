package com.au.threadi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdCons {
	
	ExecutorT executorServiceThreadPool;
    static ArrayList<Integer> consumerdata = new ArrayList<>(); 
    
    public static void main(String[] args) {
    	ProdCons prodconsumer = new ProdCons();
        prodconsumer.init();
                Iterator<Integer> it = consumerdata.iterator(); 
                    while(it.hasNext()) {
                        Object element = it.next(); 
                        Logger.getLogger(ProdCons.class.getName()).log(Level.INFO, "element",element+" " );   
                    } 
    }
    private void init() {
        executorServiceThreadPool = new ExecutorT();
        for(int i = 0; i < 10; i++){
            executorServiceThreadPool.addThread(new Producer(i));   
            executorServiceThreadPool.addThread(new Consumer(i));
        }
                executorServiceThreadPool.finish();
    }
    private class Producer implements Runnable {
            int data;
            public Producer(int datatoput) {
               data = datatoput;
             }
        @Override
        public void run() {         
        	Logger.getLogger(ProdCons.class.getName()).log(Level.INFO, "Inserting",data );
            try {
                executorServiceThreadPool.q.put(data);
                    Thread.sleep(100);
            } catch (InterruptedException e) {
            	Thread.currentThread().interrupt();
            }
        }
    }
    private class Consumer implements Runnable {
                int datatake;
                int data; 
                public Consumer(int datatoput) {
                    data = datatoput;
                  }
        @Override
        public void run() {                                 
                try 
                {
                	Logger.getLogger(ProdCons.class.getName()).log(Level.INFO, "My Consuming",data );
                    datatake = executorServiceThreadPool.q.take();
                    consumerdata.add(datatake);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                	Thread.currentThread().interrupt();
                }
        }
    }
}