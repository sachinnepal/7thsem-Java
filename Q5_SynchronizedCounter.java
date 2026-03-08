
class Counter{
    int count=0;

    synchronized void increment(){
        count++;
    }
}

class Worker extends Thread{
    Counter c;

    Worker(Counter c){ this.c=c; }

    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}

public class Q5_SynchronizedCounter{
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Worker t1 = new Worker(c);
        Worker t2 = new Worker(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter: "+c.count);
    }
}
