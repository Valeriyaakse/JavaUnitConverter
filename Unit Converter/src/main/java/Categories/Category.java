package main.java.Categories;

import main.java.ConversionException;
import main.java.UnitConverters.BaseConverter;
import main.java.UnitConverters.LengthConverter;
import main.java.UnitConverters.TemperatureConverter;
import main.java.UnitConverters.WeightConverter;

public enum Category {
    LENGTH, TEMPERATURE, WEIGHT;

    public static BaseConverter<?> getConverter(Category category) {
      switch (category) {
          case LENGTH : return new LengthConverter();
          case TEMPERATURE: return new TemperatureConverter();
          case WEIGHT:return new WeightConverter();
          default: throw new IllegalArgumentException("неизвестная категория");
      }
    }

    public static Category getCategory(String str) throws ConversionException {
        try {
            return Category.valueOf(str.toUpperCase());
    } catch (IllegalArgumentException e) {
            throw new ConversionException(str + "неизвестная категория");
        }
    }
    }

