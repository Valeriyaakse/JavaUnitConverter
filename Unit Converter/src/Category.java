public enum Category {
    LENGTH(new LengthConverter()), TEMPERATURE(new TemperatureConverter()), WEIGHT(new WeightConverter());
    private BaseConverter<?> converter;
    Category(BaseConverter<?> converter) {
        this.converter = converter;
    }

    public BaseConverter<?> getConverter() {
        return converter;
    }

    public static Category getCategory(String str) throws ConversionException {
        try {
            return Category.valueOf(str.toUpperCase());
    } catch (IllegalArgumentException e) {
            throw new ConversionException("неизвестная категория");
        }
    }
    }

