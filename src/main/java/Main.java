import pojo.AbstractFigure;
import util.RandomUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractFigure> generatedFigures = RandomUtil.generate();
        RandomUtil.print(generatedFigures);
    }
}
