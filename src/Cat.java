import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int fullness;


    private boolean isFull;

    public Cat(String name, int fullness) {
        this.name = name;
        this.fullness = fullness;
    }

    public String getName() {
        return name;
    }

    public int getFullness() {
        return fullness;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean eat(@NotNull Plate plate) {
        //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
        //4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
        if (plate.getFoodLevel() >= fullness) {
            plate.setFoodLevel(plate.getFoodLevel() - fullness);
            isFull = true;
        }
        return isFull;
    }
}
