package main.java.UnitConverters;

import main.java.Categories.Categories.Weight;
import main.java.ConversionException;

public class WeightConverter extends BaseConverter<Weight> {
    @Override
    public double convert(double value, Weight from, Weight to) throws ConversionException {
        if (from.equals(to)) {
            return value;
        } else if (from == Weight.KILOGRAM && to == Weight.POUND) {
            return value * 2.20462;
        } else if (from == Weight.POUND && to == Weight.KILOGRAM) {
            return value / 2.20462;
        } else if (from == Weight.KILOGRAM && to == Weight.OUNCE) {
            return value * 35.274;
        } else if (from == Weight.POUND && to == Weight.OUNCE) {
            return value * 16;
        } else if (from == Weight.OUNCE && to == Weight.KILOGRAM) {
            return value / 35.274;
        } else if (from == Weight.OUNCE && to == Weight.POUND) {
            return value / 16;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }
    }
}
