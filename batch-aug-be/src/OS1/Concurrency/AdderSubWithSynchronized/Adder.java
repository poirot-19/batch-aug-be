package OS1.Concurrency.AdderSubWithSynchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;

    public Adder(Count count1){
        this.count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            synchronized (count){
                count.value += i;
            }
        }
    }
}
