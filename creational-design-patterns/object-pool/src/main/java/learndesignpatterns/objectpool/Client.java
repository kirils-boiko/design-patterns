package learndesignpatterns.objectpool;

import learndesignpatterns.objectpool.customfx.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 10);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10,10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(20,20));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);

        Bitmap b3 = bitmapPool.get();
        Bitmap b4 = bitmapPool.get();
        b3.draw();
        b4.draw();
    }
}
