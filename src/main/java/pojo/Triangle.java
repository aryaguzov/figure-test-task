package pojo;

import static util.ValidationUtil.checkInputData;

public class Triangle extends AbstractFigure {
    private final double perpendicular;

    private final double adjacent;

    private final double hypotenuse;


    public Triangle(String color, double perpendicular, double adjacent) {
        super(color);
        checkInputData(perpendicular, adjacent);
        this.perpendicular = perpendicular;
        this.adjacent = adjacent;
        this.hypotenuse = calculateHypotenuse();
        this.area = calculateArea();
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getPerpendicular() {
        return perpendicular;
    }

    public double getAdjacent() {
        return adjacent;
    }

    @Override
    public double calculateArea() {
        return this.adjacent * this.perpendicular / 2;
    }

    @Override
    public void draw() {
        System.out.println("Draw the triangle.");
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Triangle, area: %.2f, hypotenuse: %.2f, color: %s%n", this.area, this.hypotenuse, this.color);
    }

    private double calculateHypotenuse() {
        return Math.sqrt(this.perpendicular * this.perpendicular + this.adjacent * this.adjacent);
    }
}
