package learndesignpatterns.proxy.dynamic;

import learndesignpatterns.proxy.BitmapImage;
import learndesignpatterns.proxy.Image;
import learndesignpatterns.proxy.customfx.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



//Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {

	private String filename;
	private Point2D location;
	private BitmapImage image;
	private static Method getLocationMethod;
	private static Method setLocationMethod;
	private static Method renderMethod;

	// cache the method for further usage
	static {
		try {
			getLocationMethod = Image.class.getMethod("getLocation", null);
			setLocationMethod = Image.class.getMethod("setLocation", Point2D.class);
			renderMethod = Image.class.getMethod("render", null);
		} catch (NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}

	public ImageInvocationHandler(String filename) {
		this.filename = filename;
	}

	// This method is called on every method invocation on the proxy
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// you can implement proxy here as well
		System.out.println("Invoking method: " + method.getName());
		if (method.equals(getLocationMethod)) {
			return handleGetLocation();
		}
		if (method.equals(setLocationMethod)) {
			return handleSetLocation(args);
		}
		if (method.equals(renderMethod)) {
			return handleRender();
		}
		return null;
	}

	private Point2D handleGetLocation() {
		if (image == null) {
			return location;
		}
		return image.getLocation();
	}

	private Object handleSetLocation(Object[] args) {
		if (image == null) {
			location = (Point2D) args[0];
			return null;
		}
		image.setLocation((Point2D) args[0]);
		return null;
	}

	private Object handleRender() {
		if (image == null) {
			image = new BitmapImage(filename);
		}
		image.render();
		return null;
	}




}
