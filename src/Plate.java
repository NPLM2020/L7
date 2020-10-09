public class Plate {
    private int capacity;
    private int foodLevel;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    public void setFoodLevel(int foodLevel) {
        if (foodLevel >= 0 && foodLevel <= capacity) {
            this.foodLevel = foodLevel;
        }
    }
}
