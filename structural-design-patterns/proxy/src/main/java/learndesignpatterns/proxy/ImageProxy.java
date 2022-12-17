package learndesignpatterns.proxy;

import learndesignpatterns.proxy.customfx.Point2D;

//Proxy class.
public class ImageProxy implements Image {

    private BitmapImage bitmapImage;
    private String filename;
    private Point2D location;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (bitmapImage != null) { // we already have a bitmap image object
            bitmapImage.setLocation(point2d);
        } else { // we haven't yet initialized the bitmap image, hold on to point2d
            this.location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(filename);
            if (location != null) {
                bitmapImage.setLocation(location);
            }
        }
        bitmapImage.render();
    }
}
