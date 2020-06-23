import java.util.function.ToDoubleFunction;

public class FunctionalProgramming2 {
    public static ToDoubleFunction<Triangle> f = t -> {
        t.setArea(0.5 * t.height * t.base);
        return t.getArea();
    };
}

class Triangle {
    public final int height;
    public final int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    private double area;
    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }
}