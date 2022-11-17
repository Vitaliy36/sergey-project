package org.example.lesson01;

public class TemperatureService {
    //Температура (метод получает на вход число градусов int, возвращает холодно, тепло),
    // можно еще добавить зависимость от времени года.
    //public String getWeather(int temperature);
    //if temp < 0 return “Cold”
    //if temp 0 - 20 “Warm”
    //if temp > 20 “Hot”
    //if temp < -273 “Error”

    public String getWeather(int temp) {
        if (temp < -273 || temp > 100) {
            return "Error";
        } else if (temp < 0) {
            return "Cold";
        } else if (temp < 20) {
            return "Warm";
        } else {
            return "Hot";
        }


    }


    public String getSeasonWeather(int temp, int month) {

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("\nWINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("\nSPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("\nSUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("\nAUTUMN");
                break;
            default:

                // Handles the condition if number entered
                // is not among the valid 12 months
                System.out.println("\nInvalid Month number");
                break;
        }
        if (temp <= 0 && temp > -89 && month == 12 || temp <= 0 && temp > -89 && month == 1 || temp <= 0 && temp > -89 && month == 2) {
            return "Winter - cold";
        }
        if (temp > 0 && temp <= 20 && month == 3 || temp > 0 && temp <= 20 && month == 4 || temp > 0 && temp <= 20 && month == 5) {
            return "Spring - warm";
        }
        if (temp > 20 && temp < 40 && month == 6 || temp > 20 && temp < 40 && month == 7 || temp > 20 && temp < 40 && month == 8) {
            return "Summer - hot";
        }
        if (temp > 5 && temp < 25 && month == 9 || temp > 5 && temp < 25 && month == 10 || temp > 5 && temp < 25 && month == 11) {
            return "Autumn - less hot";
        }
        if (temp >= -273 && temp <= 57 && month == 12
                || temp <= -273 && month == 1
                || temp <= -273 && month == 2
                || temp <= -273 && month == 3
                || temp <= -273 && month == 4
                || temp <= -273 && month == 5
                || temp <= -273 && month == 6
                || temp <= -273 && month == 7
                || temp <= -273 && month == 8
                || temp <= -273 && month == 9
                || temp <= -273 && month == 10
                || temp <= -273 && month == 11) {

            return "Maximum possible temperature";

        }
        return "Temperature and Month does not matches";
    }


    }

