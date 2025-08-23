 abstract public class BaseConverter<T> {
      abstract public double convert(double value, T from, T to) throws ConversionException;



 }