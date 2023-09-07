package OS1.Concurrency.AdderSubWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;
    Lock lock;

    public Adder(Count count1, Lock lock){
        this.count = count1;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            lock.lock();
            count.value += i;
            lock.unlock();
        }
    }
}
