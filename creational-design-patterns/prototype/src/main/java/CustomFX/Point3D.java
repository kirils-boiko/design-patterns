package CustomFX;

public class Point3D {

    private final double x;
    private final double y;
    private final double z;

    public static final Point3D ZERO = new Point3D(0,0,0);

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D normalize() {
        return new Point3D(this.x, this.y, this.z);
    }

    public Point3D add(double x, double y, double z) {
        return new Point3D(this.x + x, this.y + y, this.z + z);
    }

    public Point3D add(Point3D point) {
        return new Point3D(this.x + point.x, this.y + point.y, this.z + point.z);
    }

    public Point3D multiply(double factor) {
        return new Point3D(this.x * factor, this.y * factor, this.z * factor);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f,%.2f)", x, y, z);
    }
}
