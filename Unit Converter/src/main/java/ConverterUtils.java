package main.java;

import main.java.Categories.Categories.Length;
import main.java.Categories.Categories.Temperature;
import main.java.Categories.Categories.Weight;
import main.java.Categories.Category;

public class ConverterUtils {

    public static Enum<?>[] parseUnits(Category category, String from_Unit, String to_Unit) throws ConversionException {
       try {
        switch (category) {
            case LENGTH:
                return new Length[]{Length.valueOf(from_Unit), Length.valueOf(to_Unit)};
            case TEMPERATURE:
                return new Temperature[]{Temperature.valueOf(from_Unit), Temperature.valueOf(to_Unit)};
            case WEIGHT:
                 return new Weight[] { Weight.valueOf(from_Unit), Weight.valueOf(to_Unit)};
            default: throw new IllegalArgumentException("неизвестная категория");
        }
       } catch (IllegalArgumentException e) {
           throw new ConversionException("Неизвестные единицы измерения");
       }

    }
}

