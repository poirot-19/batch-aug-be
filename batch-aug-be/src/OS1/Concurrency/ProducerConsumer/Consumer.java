package OS1.Concurrency.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    private int maxSize;
    private String name;
    private Queue<Object> store;

    public Consumer(int maxSize, String name, Queue<Object> store) {
        this.maxSize = maxSize;
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (this.store.size() > 0) {
                System.out.println(this.name + " Removing a shirt " + this.store.size());
                    store.remove();
                }
            }
        }
    }
}
