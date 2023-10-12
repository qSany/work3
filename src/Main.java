public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний ");


        } else {
            System.out.println("Вы не достигли совершеннолетия , нужно немного подождать");

        }




        System.out.println("Задача2");

        double temp = 3.0;

        if(temp < 5){
            System.out.printf("На улице %.0f градусов, нужно надеть шапку.", temp);
        }else{
            System.out.printf("На улице %.0f градусов, можно идти без шапки.", temp );
        }



        System.out.println("Задача 3");
        double speed = 70;

        if (speed > 60) {
            System.out.print("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.print("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задача 4");

        if (age <= 6 && age >= 2) {
            System.out.println("Если возраст человека равен 2 или 6 (" + age + " years)," +
                    " то ему нужно ходить в садик.");
        } else if (age > 6 && age <= 17) {
            System.out.println("Если человеку от 7 до 17 years (" + age +")," +
                    " о ему нужно ходить в школу");
        } else if (age <= 24 && age >= 18) {
            System.out.println("Если человеку больше или равно (" + age +") и " +
                    " моложе 25 лет," +
                    " тогда их место в университете.");
        } else if (age > 24) {

        }

        System.out.println("Задача 5");

        if (age < 5) {
            System.out.println("Если возраст ребенка меньше 5 лет (" + age + "), то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка больше 5 лет и меньше 14 (" + age + "), то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age == 14 || age > 14) {
            System.out.println("Если возраст ребенка 14 лет (" + age + ") или больше, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }




        System.out.println("Задача 6");

        int vagonCapacity = 102; // вместимость вагона
        int seatsAvailable = 60; // количество свободных сидячих мест
        boolean isFull = false; // указывает, заполнен ли вагон

        // проверяем заполненность вагона
        if (seatsAvailable > 0) {
            isFull = (vagonCapacity - seatsAvailable) == 0;
        }

        // выводим сообщение о заполненности вагона
        if (isFull) {
            System.out.println("Вагон уже полностью заполнен.");
        } else {
            if (seatsAvailable == 0) {
                System.out.println("В вагоне есть только стоячие места.");
            } else {
                System.out.println("В вагоне есть сидячие места.");
            }
        }



        System.out.println("Задача 7");
        int one, two, three;

        one = 5;
        two = 3;
        three = 1;
        if(one > two && one > three)
            System.out.println("Первое число - наибольшее.");
        else if(two > one && two > three)
            System.out.println("Второе число - наибольшее.");
        else
            System.out.println("Третье число - наибольшее.");
    }
}










