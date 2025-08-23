public class ConverterUtils {
    String category;
    String from_Unit;
    String to_Unit;
    ConverterUtils (String category, String from_Unit, String to_Unit, double value) {
        this.category = category;
        this.from_Unit = from_Unit;
        this.to_Unit = to_Unit;
    }
    public static Object[] parseUnits(Category category, String from_Unit, String to_Unit) throws ConversionException {
       try {
        switch (category) {
            case LENGTH:
                return new Object[]{Length.valueOf(from_Unit), Length.valueOf(to_Unit)};
            case TEMPERATURE:
                return new Object[]{Temperature.valueOf(from_Unit), Temperature.valueOf(to_Unit)};
            case WEIGHT:
                 return new Object[] { Weight.valueOf(from_Unit), Weight.valueOf(to_Unit) };
            default: throw new ConversionException("неизвестная категория");
        }
       } catch (IllegalArgumentException e) {
           throw new ConversionException("неизвестные единицы");
       }

    }
}

