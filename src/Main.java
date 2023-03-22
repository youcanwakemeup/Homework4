public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " , то не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte temperature = 0;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short speed = 130;
        boolean isFine = speed > 60;
        boolean isNoFine = speed <= 60;
        if (isNoFine) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else if (isNoFine) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4"); // использовал else if, так как уже знаком с данной конструкцией
        byte age = 23;
        boolean isKindergarten = age >= 2 && age <= 6;
        boolean isSchool = age >= 7 && age <= 18;
        boolean isUniversity = age > 18 && age < 24;
        boolean isWork = age >= 24;
        if (isKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
        }
        else if (isSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (isUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (isWork) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte age = 13;
        boolean notAllowed = age < 5;
        boolean allowedWithParents = age >= 5 && age < 14;
        boolean allowed = age >= 14;
        if (notAllowed) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься");
        }
        else if (allowedWithParents) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься в сопровождении взрослого");
        }
        else if (allowed) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься одному");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6"); // представим, что люди всегда садятся на свободное место, вместо того, что бы стоять
        short totalRoom = 102;
        byte seatingRoom = 60;
        int standingRoom = totalRoom - seatingRoom;
        byte occupiedRoom = 72;
        boolean noRoom = occupiedRoom >= totalRoom;
        boolean standingRoomAvailable = occupiedRoom < totalRoom && occupiedRoom >= seatingRoom;
        boolean seatingRoomAvailable = occupiedRoom < seatingRoom;
        if (noRoom) {
            System.out.println("Вагон полностью забит");
        }
        else if (standingRoomAvailable) {
            System.out.println("Есть только стоячие места");
        }
        else if (seatingRoomAvailable) {
            System.out.println("Есть сидячие места");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 5;
        int two = 7;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}