public class LengthConverter extends BaseConverter<Length> {
    @Override
    public double convert(double value, Length from, Length to) throws ConversionException {
        if (from.equals(to)) {
            return  value;
        } else if (from.equals(Length.METER) && to.equals(Length.KILOMETER)) {
            return value * 0.001;
        } else if (from.equals(Length.KILOMETER) && to.equals(Length.METER)) {
            return value * 1000;
        } else if (from.equals(Length.METER) && to.equals(Length.MILE)) {
            return value / 1609;
        } else if (from.equals(Length.KILOMETER) && to.equals(Length.MILE)) {
            return value / 1.609;
        } else if (from.equals(Length.MILE) && to.equals(Length.METER)) {
            return value * 1609;
        } else if (from.equals(Length.MILE) && to.equals(Length.KILOMETER)) {
            return value * 1.609;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }

    }

}

