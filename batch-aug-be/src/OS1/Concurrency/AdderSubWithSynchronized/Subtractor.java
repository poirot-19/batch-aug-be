package OS1.Concurrency.AdderSubWithSynchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Count count;

    public Subtractor(Count count1){
        count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <=10000; i++){
            synchronized (count) {
                count.value -= i;
            }
        }

    }
}
