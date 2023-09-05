package OS1.Concurrency.MergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = Arrays.asList(7,1,4,2,6,8,5);
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
//        List<Integer> sortedArrayList = mergeSorter.call();
        Future<List<Integer>> sortedArrayList = executorService.submit(mergeSorter);
        System.out.println("Sorted Array List is " + sortedArrayList.get());
        System.out.println("After completing sorting");


    }
}
