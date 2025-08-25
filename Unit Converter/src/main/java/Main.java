package main.java;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
           System.out.println("""
                    Введите данные для конвертации. Сначала введите величину: length, temperature или weight.
                    Затем через пробел введите значение для конвертации. Затем через пробел введите единицы измерения. 
                    Вы можете выбрать из следующих единиц: 
                    length - meter, kilometer, mile
                    temperature - celsius, fahrenheit, kelvin 
                    weight - kilogram, pound, ounce.
                    Для выхода из конвертера введите exit""");

               Scanner scanner = new Scanner(System.in);
        while (true) {
               String input = scanner.nextLine();

               if (input.equalsIgnoreCase("exit")) {
                   System.out.println("завершение программмы");
                   break;
               }

               try {
                   String[] parts = input.split(" ");
                   if (parts.length != 4) {
                       throw new ConversionException("данных для конвертации недостаточно");
                   }
                   String category = parts[0]; // категория
                   double value = Double.parseDouble(parts[1]); //значение
                   if (value < 0) {
                       throw new ConversionException("число не может быть отрицательным");
                   }
                   String from_Unit = parts[2].toUpperCase(); // из каких единиц переводим
                   String to_Unit = parts[3].toUpperCase();// в какие единицы переводим
                   System.out.println(Converter.convert(category, value, from_Unit, to_Unit));
               } catch (ConversionException e) {
                   System.out.println(e.getMessage());
               } catch (NumberFormatException e) {
                   System.out.println("неверный формат числа");
               } catch (Exception e) {
                   System.out.println("непредвиденная ошибка: " + e.getMessage());
               }
           }
        scanner.close();
        
    }
}