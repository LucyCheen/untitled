public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) throws IllegalAccessException{
        if (radius >= 0)
            this.radius = radius;
        else
            throw new IllegalAccessException("The radius need to be positive.");

    }
}
