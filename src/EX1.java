//Задание 1. Проверка корректности даты
//        Напишите метод, который проверяет, является ли введенная строка корректной
//датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
//до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
//об ошибке.


public class EX1 {
    public static void EX1(String a) {

    }
    public static String validateData (String date){
        try {
            if (date.length() != 10){
                return "Invalid Date";
            }
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(5, 7));
            int day = Integer.parseInt(date.substring(8, 10));

            if (year < 1 || year > 9999){
                return "Invalid Year";
            }
            if (month < 1 || month > 12){
                return "Invalid Month";
            }
            int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && IsLeapYear(year)){
                daysInMonth [1] = 29;
            }
            if (day < 1 || day > daysInMonth[month-1]){
                return "Invalid Day";
            }
        } catch (NumberFormatException e) {
            System.out.println("Error parsing date");
        } catch (Exception e){
            System.out.println("Error");
        }
        return date;
    }
    public static boolean IsLeapYear (int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
