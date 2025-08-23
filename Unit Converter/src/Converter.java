public class Converter {
    String category;
    double value;
    String from_Unit;
    String to_Unit;
    Converter (String category, double value, String from_Unit, String to_Unit) {
        this.category = category;
        this.from_Unit = from_Unit;
        this.to_Unit = to_Unit;
        this.value = value;
    }
    public static String convert(String category, double value, String from_Unit, String to_Unit) throws ConversionException {
        Category typeOfCategory = Category.getCategory(category.toUpperCase());
        Object[] units = ConverterUtils.parseUnits(typeOfCategory,from_Unit,to_Unit);
        BaseConverter converter = typeOfCategory.getConverter();
        return value + " " + units[0] + " = " + converter.convert(value,units[0],units[1]) + " " + units[1];
    }
}
