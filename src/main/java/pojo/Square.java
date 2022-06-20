package pojo;

import static util.ValidationUtil.checkInputData;

public class Square extends AbstractFigure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        checkInputData(side);
        this.side = side;
        this.area = calculateArea();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Draw the square.");
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Square, area: %.2f, side: %.2f, color: %s%n", this.area, this.side, this.color);
    }
}
