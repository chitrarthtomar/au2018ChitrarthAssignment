import java.util.ArrayList;
import java.util.Iterator;

public class ProdCons {
	
	ExecutorTest executorServiceThreadPool;
    static ArrayList<Integer> consumerdata = new ArrayList<Integer>(); 
    
    public static void main(String[] args) {
    	ProdCons prodconsumer = new ProdCons();
        prodconsumer.init();
                Iterator<Integer> it = consumerdata.iterator(); 
                    while(it.hasNext()) {
                        Object element = it.next(); 
                        System.out.print(element + " ");    
                    } 
    }
    private void init() {
        executorServiceThreadPool = new ExecutorTest();
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
            System.out.println("Inserting " + data);
            try {
                executorServiceThreadPool.q.put(data);
                    Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
    private class Consumer implements Runnable {
                int datatake,data; 
                public Consumer(int datatoput) {
                    data = datatoput;
                  }
        @Override
        public void run() {                                 
                try 
                {
                	System.out.println("Consuming " + data);
                    datatake = executorServiceThreadPool.q.take();
                    consumerdata.add(datatake);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
        }
    }
}