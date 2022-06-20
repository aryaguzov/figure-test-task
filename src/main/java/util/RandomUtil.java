package util;

import pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomUtil {
    private static final int MAX_RANGE_NUMBER = 10;

    private static final int MAX_FIGURE_NUMBER = 4;

    private static final int MAX_ARRAY_LENGTH = 1000;

    private RandomUtil() {
    }

    public static void print(List<AbstractFigure> figures) {
        figures.forEach(AbstractFigure::printInfo);
    }

    public static List<AbstractFigure> generate() {
        List<AbstractFigure> generatedFigures = new ArrayList<>();
        int length = (int) (getRandomNumber(MAX_ARRAY_LENGTH));

        for (int i = 0; i < length; i++) {
            generatedFigures.add(getRandomFigure());
        }
        return generatedFigures;
    }

    private static AbstractFigure getRandomFigure() {
        AbstractFigure figure = null;
        int number = (int) (getRandomNumber(MAX_FIGURE_NUMBER) + 1);

        switch (number) {
            case 1:
                figure = getRandomCircle();
                break;
            case 2:
                figure = getRandomSquare();
                break;
            case 3:
                figure = getRandomTrapezoid();
                break;
            case 4:
                figure = getRandomTriangle();
                break;
        }
        return figure;
    }

    private static Circle getRandomCircle() {
        double radius = getRandomNumber(MAX_RANGE_NUMBER);
        return new Circle(getRandomColor(), radius);
    }

    private static Square getRandomSquare() {
        double side = getRandomNumber(MAX_RANGE_NUMBER);
        return new Square(getRandomColor(), side);
    }

    private static Trapezoid getRandomTrapezoid() {
        double baseA = getRandomNumber(MAX_RANGE_NUMBER);
        double baseB = getRandomNumber(MAX_RANGE_NUMBER);
        double height = getRandomNumber(MAX_RANGE_NUMBER);
        return new Trapezoid(getRandomColor(), baseA, baseB, height);
    }

    private static Triangle getRandomTriangle() {
        double perpendicular = getRandomNumber(MAX_RANGE_NUMBER);
        double adjacent = getRandomNumber(MAX_RANGE_NUMBER);
        return new Triangle(getRandomColor(), perpendicular, adjacent);
    }

    private static String getRandomColor() {
        List<String> colors = Stream.of(ColorType.values())
                .map(Enum::name)
                .collect(Collectors.toList());

        int randomNum = (int) (getRandomNumber(colors.size()));
        return colors.get(randomNum);
    }

    private static double getRandomNumber(int number) {
        return Math.random() * number;
    }
}
