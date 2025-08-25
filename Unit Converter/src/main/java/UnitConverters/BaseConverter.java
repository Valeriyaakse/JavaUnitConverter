package main.java.UnitConverters;


import main.java.ConversionException;

public abstract class BaseConverter<T> {
      abstract public double convert(double value, T from, T to) throws ConversionException;



 }