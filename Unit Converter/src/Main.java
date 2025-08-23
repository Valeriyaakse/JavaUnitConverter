
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       try {
           Scanner scanner = new Scanner(System.in);
           String input = scanner.nextLine();
           String[] parts = input.split(" ");
           if (parts.length != 4) {
               throw new ConversionException("данных для конвертации недостаточно");
           }
           String category = parts[0]; // категория
              double value = Double.parseDouble(parts[1]); //значение
           if (value < 0) {
               throw new ConversionException("несуществующие единицы");
           }
           String from_Unit = parts[2].toUpperCase(); // из каких единиц переводим
           String to_Unit = parts[3].toUpperCase();// в какие единицы переводим
           System.out.println(Converter.convert(category, value, from_Unit, to_Unit));
       } catch (ConversionException e) {
           System.out.println(e.getMessage());
       } catch (NumberFormatException e) {
           System.out.println("неверный формат числа");
       }

    }
}