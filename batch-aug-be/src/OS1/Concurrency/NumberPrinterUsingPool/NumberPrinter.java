package OS1.Concurrency.NumberPrinterUsingPool;

public class NumberPrinter implements Runnable{
    int numberToPrint;

    public NumberPrinter(int i){
        numberToPrint = i;
    }

    @Override
    public void run() {
        System.out.println("Number being printed " + numberToPrint + " " +  Thread.currentThread().getName());
    }
}
