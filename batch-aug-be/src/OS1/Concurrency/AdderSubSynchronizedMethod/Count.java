package OS1.Concurrency.AdderSubSynchronizedMethod;

public class Count {
    public int value = 0;

    int getValue(){
        return this.value;
    }

    public synchronized void incrementValue(int offset){
        this.value += offset;
    }
}
