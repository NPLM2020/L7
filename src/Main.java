public class Main {

    public static void main(String[] args) {

        //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
        Cat[] cats = new Cat[]{
                new Cat("Oliver", 20),
                new Cat("Mars", 15),
                new Cat("Jenny", 30),
                new Cat("Molly", 22),
                new Cat("Fluffy", 17),
        };

        Plate plate = new Plate(100);
        plate.setFoodLevel(100);

        for (Cat cat : cats) {
            System.out.println();
            System.out.printf("Cat %s is full: %s\n", cat.getName(), cat.eat(plate));
            System.out.printf("Food level in the plate is %s\n", plate.getFoodLevel());
        }


    }
}
