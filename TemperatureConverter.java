
import java.util.Scanner;


public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature value: ");
        double temperature = sc.nextDouble();

        System.out.println("Enter unit of temperature (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().charAt(0);

        double convertedTemperature;

         if (unit =='C' || unit == 'c'){
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("The converted temperature in Fahrenheit is:" + convertedTemperature + "F");
         }

        else if(unit =='F' || unit =='f'){
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("The converted temperature in Celsius is:" + convertedTemperature + "C");
         }


    else{
    System.out.println("Invalid unit of measurement");


    }
    sc.close();
}


public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
    }


public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }
    }