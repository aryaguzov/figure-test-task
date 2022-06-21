package pojo;

public abstract class AbstractFigure {
    protected final String color;

    protected double area;

    public AbstractFigure(String color) {
        this.color = color;
        this.area = calculateArea();
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double calculateArea();

    public abstract void draw();

    public abstract void printInfo();
}
