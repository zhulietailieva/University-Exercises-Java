import java.math.*;
public class Circle  implements Figure{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float CalculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}
