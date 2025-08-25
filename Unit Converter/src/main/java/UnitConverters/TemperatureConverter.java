package main.java.UnitConverters;

import main.java.Categories.Categories.Temperature;
import main.java.ConversionException;

public class TemperatureConverter extends BaseConverter<Temperature> {
    @Override
    public double convert(double value, Temperature from, Temperature to) throws ConversionException {
        if (from.equals(to)) {
            return value;
        } else if (from == Temperature.CELSIUS && to == Temperature.KELVIN) {
            return value + 273.15;
        } else if (from == Temperature.KELVIN && to == Temperature.CELSIUS) {
            return value - 273.15;
        } else if (from == Temperature.CELSIUS && to == Temperature.FAHRENHEIT) {
            return 32 + value * 9 / 5;
        } else if (from == Temperature.KELVIN && to == Temperature.FAHRENHEIT) {
            return (value - 273.15) * 9 / 5 + 32;
        } else if (from == Temperature.FAHRENHEIT && to == Temperature.CELSIUS) {
            return (value - 32) * 5 / 9;
        } else if (from == Temperature.FAHRENHEIT && to == Temperature.KELVIN) {
            return (value - 32) * 5 / 9 + 273.15;
        } else {
            throw new ConversionException("Невозможно конвертировать из " + from + " в " + to);
        }
    }
}