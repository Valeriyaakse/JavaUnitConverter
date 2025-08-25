package main.java;

import main.java.Categories.Category;
import main.java.UnitConverters.BaseConverter;

public class Converter {

    public static String convert(String category, double value, String from_Unit, String to_Unit) throws ConversionException {
        Category typeOfCategory = Category.getCategory(category);
        Enum<?>[] units = ConverterUtils.parseUnits(typeOfCategory,from_Unit,to_Unit);
        BaseConverter converter = Category.getConverter(typeOfCategory);
        return String.format("%s %s = %s %s", value, units[0], converter.convert(value, units[0], units[1]), units[1]);
    }
}
