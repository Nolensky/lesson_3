public class Main {
    public static void main(String[] args) {
        // Задача 1

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");

        }else{
                System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, придется немного подождать");
            }

        // Задача 2
        int tempInSide = 16;
        if (tempInSide < 5){
            System.out.println("На улице " + tempInSide + " градусов, нужно надеть шапку");
        }else {
            System.out.println("На улице " + tempInSide + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 67;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        // Задача 4
        int agePerson = 8;
        if (agePerson > 2 && agePerson < 6){
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в детский сад");
        }else if ( agePerson > 7 &&  agePerson < 17){
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в школу");
        }else if (agePerson >= 18 && agePerson <= 24){
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в университет");
        }else if (agePerson > 24){
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить на работу");
        }else{
            System.out.println("Указан неверный возраст");
        }


        // Задача 5

        int kidAge = 14;
        boolean haveGrownup = false;
        if (kidAge < 5){
                System.out.println("Если возраст ребенка " + kidAge + ", то ему нельзя кататся на атракционе");
        }else if (haveGrownup  && kidAge < 14) {
            System.out.println("Если возраст ребенка " + kidAge + ", то ему можно кататся на атракционе в соправождении взрослого");
        }else if (haveGrownup != true){
                System.out.println("В этот возрасте без соправождения взрослого кататься нельзя");
        }else if (kidAge >=14){
                System.out.println("Если возраст ребенка " + kidAge + ", то ему можно кататся на атракционе без соправождении взрослого");
        }

        // Задача 6
        int quantitySeating = 57;
        int quantityStanding = 42;
        if ((60 - quantitySeating) == 0 && (102 - 60) - quantityStanding == 0) {
            System.out.println("В ваоне мест нет");
        }else if (quantitySeating > 60 || quantityStanding > (102 -60)){
            System.out.println("Вы ввели не корректное количество");
        } else {
            System.out.println("В вагоне есть " + (60 - quantitySeating) + " сидячих мест и " + ((102 - 60) - quantityStanding) + " стоячих мест");
        }

        //Задача 7
        int one = 34;
        int two = 102;
        int three = 76;
        if (one > two && one > three){
            System.out.println("Первое число больше остальных");
        }else if (two > one && two > three){
            System.out.println("Второе число больше остльных");
        }else if (three > one && three > two){
            System.out.println("Третье число больше остальных");
        }





    }

}