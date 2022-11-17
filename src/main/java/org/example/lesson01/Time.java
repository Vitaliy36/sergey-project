package org.example.lesson01;

public class Time {

    //Метод получает время в часах, возвращает “утро”, “день”, “вечер”, “ночь”.
    // Предусмотреть значения < 0 и больше 24 “Error”
    public String getTime (int time) {
        if (time < 0 || time > 23) {
            return "Error";
        }else if (time < 7) {
            return "Night";
        }else if (time < 12){
            return "Morning";
        }else if (time < 19){
            return "Day";
        }else {
            return "Evening";
        }
    }
}
