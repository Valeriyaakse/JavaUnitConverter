public class TemperatureConverter extends BaseConverter<Temperature> {
    @Override
    public double convert(double value, Temperature from, Temperature to) throws ConversionException {
        if (from.equals(to)) {
            return value;
        } else if (from.equals(Temperature.CELSIUS) && to.equals(Temperature.KELVIN)) {
            return value + 273.15;
        } else if (from.equals(Temperature.KELVIN) && to.equals(Temperature.CELSIUS)) {
            return value - 273.15;
        } else if (from.equals(Temperature.CELSIUS) && to.equals(Temperature.FAHRENHEIT)) {
            return 32 + value * 9 / 5;
        } else if (from.equals(Temperature.KELVIN) && to.equals(Temperature.FAHRENHEIT)) {
            return (value - 273.15) * 9 / 5 + 32;
        } else if (from.equals(Temperature.FAHRENHEIT) && to.equals(Temperature.CELSIUS)) {
            return (value - 32) * 5 / 9;
        } else if (from.equals(Temperature.FAHRENHEIT) && to.equals(Temperature.KELVIN)) {
            return (value - 32) * 5 / 9 + 273.15;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }
    }
}