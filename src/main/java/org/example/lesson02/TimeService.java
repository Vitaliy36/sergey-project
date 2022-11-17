package org.example.lesson02;

public class TimeService {

    //Метод получает время в часах, возвращает “утро”, “день”, “вечер”, “ночь”.
    // Предусмотреть значения < 0 и больше 24 “Error”
    public PartOfDay getTime (int time) {
        if (time < 0 || time > 23) {
            throw new RuntimeException("Non Existing time"); // В Java так пишутся error
        }else if (time < 7) {
            return PartOfDay.NIGHT;
        }else if (time < 12){
            return PartOfDay.MORNING;
        }else if (time < 19){
            return PartOfDay.DAY;
        }else {
            return PartOfDay.EVENING;
        }
    }
}
