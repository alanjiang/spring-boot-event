package com.agilean.thread.blocked;

public class BlockedDemo {
    public static void main(String[] args) throws Exception{
    	new BlockedDemo ().testBlocked();
    	
    }
	public void testBlocked() throws Exception {
		Counter c = new Counter();
	    
	    Thread t1 = new Thread(new Runnable() {
	        public void run() {
	            c.increase();
	        }
	    }, "t1线程");
	    t1.start();
	    //after 10s 
	    Thread t2 = new Thread(new Runnable() {
	        public void run() {
	            c.increase();
	        }
	    }, "t2线程");
	    t2.start();
	    
	    Thread.sleep(100); // 确保 t2 run已经得到执行
	    System.out.println(">>>1 t2.getState()="+t2.getState());
	   
	    Thread.sleep(10000); 
	    
	    System.out.println(">>>2 t2.getState()="+t2.getState());
	    
	    Thread.sleep(10200); 
	    
	    System.out.println(">>>3 t2.getState()="+t2.getState());
	}

	
	class Counter {
        int counter;
        public synchronized void increase() {
            counter++;
            System.out.println(">>counter="+counter+"current-Thread="+Thread.currentThread().getName()+","+Thread.currentThread().getState());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    
}
