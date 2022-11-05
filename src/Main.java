public class Main {

    public static void main(String[] args) {
        //Task1.1
        System.out.println("Задание 1.1");
        int age = 14;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило. Нужно немного подождать.");
        }
        //Task1.2
        System.out.println("Задание 1.2");
        if (age >= 7 && age <18){
            System.out.println("Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        //Task1.3
        System.out.println("Задание 1.3");
        int people = 103;
        if (people > 102) {
            System.out.println("Вагон полностью забит.");
        }
        if (people < 60) {
            System.out.println("Есть сидячие места.");
        }
        if (people >= 60 && people <= 102) {
            System.out.println("Есть стоячие места.");
        }

        //Task2.1
        System.out.println("Задание 2.1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else  {
            System.out.println("Совершеннолетие еще не наступило. Нужно немного подождать.");
        }

        //Task2.2
        System.out.println("Задание 2.2");
        if (age >= 7 && age <18){
            System.out.println("Ребенок ходит в школу.");
        } else if (age >= 18 && age < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (age >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        //Task2.3
        System.out.println("Задание 2.3");
        if (people > 102) {
            System.out.println("Вагон полностью забит.");
        } else if (people < 60) {
            System.out.println("Есть сидячие места.");
        } else if (people >= 60 && people <= 102) {
            System.out.println("Есть стоячие места.");
        }

        //Task3.1
        System.out.println("Задание 3.1");
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 19 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        //Task3.2
        System.out.println("Задание 3.2");
        if (age < 5) {
            System.out.println("Ребенок не может кататься на атракционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Ребенок может кататься на атракционе в сопровождении взрослого.");
        } else if (age > 14) {
            System.out.println("Ребенок может кататься на атракционе.");
        }

        //Task3.3
        System.out.println("Задание 3.3");
        int one = 7;
        int two = 6;
        int free = 6;
        if (one > two && one > free){
            System.out.println("Большее число: " + one);
        } else if (two > one && two > free){
            System.out.println("Большее число: " + two);
        } else if (free > one && free > two) {
            System.out.println("Большее число: " + free);
        }
    }
}