package com.au.threadi;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExecutorT {

	BlockingQueue<Integer> q =null; 
    ExecutorService executor = Executors.newFixedThreadPool(2); 
    
      public void addThread(Runnable r){  
      executor.submit(r);
      }
      
      public void finish(){
              try {
          executor.shutdown();
          executor.awaitTermination(50, TimeUnit.SECONDS);
      } catch (InterruptedException ex) {
          Logger.getLogger(ExecutorT.class.getName()).log(Level.SEVERE, null, ex);
          Thread.currentThread().interrupt();
      }
    Logger.getLogger(ExecutorT.class.getName()).log(Level.FINE, "OK!!", "All threads completed");

  }
}