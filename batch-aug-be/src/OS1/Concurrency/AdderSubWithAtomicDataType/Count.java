package OS1.Concurrency.AdderSubWithAtomicDataType;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

public class Count {
//    int value = 0;
    AtomicInteger value = new AtomicInteger(0);
}
