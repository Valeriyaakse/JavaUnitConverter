package main.java.UnitConverters;
import main.java.Categories.Categories.Length;
import main.java.ConversionException;

public class LengthConverter extends BaseConverter<Length> {
    @Override
    public double convert(double value, Length from, Length to) throws ConversionException {
        if (from.equals(to)) {
            return  value;
        } else if (from == Length.METER && to == Length.KILOMETER) {
            return value * 0.001;
        } else if (from == Length.KILOMETER && to == Length.METER) {
            return value * 1000;
        } else if (from == Length.METER && to == Length.MILE) {
            return value / 1609;
        } else if (from == Length.KILOMETER && to == Length.MILE) {
            return value / 1.609;
        } else if (from == Length.MILE && to == Length.METER) {
            return value * 1609;
        } else if (from == Length.MILE && to == Length.KILOMETER) {
            return value * 1.609;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }
    }

}

