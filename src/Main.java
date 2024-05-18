public class Main {
    public static void main(String[] args) {
        // Задача 1

        int age = 74;
        if (age < 18) {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, придется немного подождать");
        } else {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        }

        // Задача 2
        int tempInSide = 16;
        if (tempInSide < 5) {
            System.out.println("На улице " + tempInSide + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + tempInSide + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 67;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        // Задача 4
        int agePerson = 8;
        if (agePerson > 2 && agePerson < 6) {
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в детский сад");
        } else if (agePerson > 7 && agePerson < 17) {
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить в университет");
        } else if (agePerson > 24) {
            System.out.println("Если человеку " + agePerson + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Указан неверный возраст");
        }


        // Задача 5

        int kidAge = 14;

        if (kidAge < 5) {
            System.out.println("Если возраст ребенка " + kidAge + ", то ему нельзя кататся на атракционе");
        } else if (kidAge >= 5 && kidAge < 14) {
            System.out.println("Если возраст ребенка " + kidAge + ", то ему нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении");
        }else {
            System.out.println("Если возраст ребенка " + kidAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        int quantitySeating = 58;
        int quantityStanding = 40;
        if (quantitySeating > 60 || quantityStanding > (102 - 60)){
            System.out.println("Вы ввели не корректное значение");
        }else if (quantitySeating == 60 && quantityStanding == (102 - quantitySeating)) {
            System.out.println("В вагоне мест нет");
        }else if (quantitySeating < 60 && quantityStanding == (102 - 60)) {
            System.out.println("В вагоне есть сидячие места");
        }else if (quantityStanding < (102 - 60) && quantitySeating == 60) {
            System.out.println("В вагоне есть стоячие места");
        }else {
            System.out.println("В вагоне есть места");
        }

        //Задача 7
        int one = 10;
        int two = 10;
        int three = 10;
        if (one > two && one > three) {
            System.out.println("Первое число больше остальных");
        }else if (two > one && two > three) {
            System.out.println("Второе число больше остльных");
        }else if (three > one && three > two) {
            System.out.println("Третье число больше остальных");
        }else if (one == two && two > three){
            System.out.println("Первое и второе число равны и больше третьего");
        }else if (one == three && three > two){
            System.out.println("Первое и третье число равны и больше второго");
        }else if (two == three && three > one){
            System.out.println("Второе и третье число равны и болше первого");
        }else {
            System.out.println("Все числа равны");
        }





    }

}