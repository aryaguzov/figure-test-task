package pojo;

import static util.ValidationUtil.checkInputData;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        checkInputData(radius);
        this.radius = radius;
        this.area = calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Draw the circle.");
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Circle, area: %.2f, radius: %.2f, color: %s%n", this.area, this.radius, this.color);
    }
}
