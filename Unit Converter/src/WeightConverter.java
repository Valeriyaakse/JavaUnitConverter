public class WeightConverter extends BaseConverter<Weight> {
    @Override
    public double convert(double value, Weight from, Weight to) throws ConversionException {
        if (from.equals(to)) {
            return value;
        } else if (from.equals(Weight.KILOGRAM) && to.equals(Weight.POUND)) {
            return value * 2.20462;
        } else if (from.equals(Weight.POUND) && to.equals(Weight.KILOGRAM)) {
            return value / 2.20462;
        } else if (from.equals(Weight.KILOGRAM) && to.equals(Weight.OUNCE)) {
            return value * 35.274;
        } else if (from.equals(Weight.POUND) && to.equals(Weight.OUNCE)) {
            return value * 16;
        } else if (from.equals(Weight.OUNCE) && to.equals(Weight.KILOGRAM)) {
            return value / 35.274;
        } else if (from.equals(Weight.OUNCE) && to.equals(Weight.POUND)) {
            return value / 16;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }
    }
}
