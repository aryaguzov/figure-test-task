package pojo;

import static util.ValidationUtil.checkInputData;

public class Trapezoid extends AbstractFigure {
    private final double baseA;

    private final double baseB;

    private final double height;

    public Trapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        checkInputData(baseA, baseB, height);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.area = calculateArea();
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (this.baseA + this.baseB) * this.height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Draw the triangle.");
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Trapezoid, area: %.2f, color: %s%n", this.area, this.color);
    }
}
