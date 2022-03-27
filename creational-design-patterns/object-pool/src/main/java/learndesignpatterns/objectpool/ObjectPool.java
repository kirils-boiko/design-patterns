package learndesignpatterns.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    // Supplier is to provide the first objects to the pool
    public ObjectPool(Supplier<T> supplier, int count) {
        availablePool = new LinkedBlockingDeque<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(supplier.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
