import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    private final float maxWeight;

    public Box() {
        this.fruits = new ArrayList<>();
        this.maxWeight = 50;
    }

    public Box(float maxWeight) {
        this.fruits = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public float getBoxWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void add(T fruit) {
        if (getBoxWeight() <= maxWeight) {
            fruits.add(fruit);
        } else {
            System.out.printf("Коробка полная, невозможно положить ещё %s", fruit.getName());
        }
    }

    public void del() {
        fruits.remove(0);
    }

    public void putAllIntoOtherBox(Box<T> box) {
        if (getBoxWeight() + box.getBoxWeight() <= box.maxWeight) {
            box.fruits.addAll(fruits);
            fruits.clear();
            System.out.println("Вы переложили фрукты из одной коробки в другую");
        } else {
            System.out.println("Невозможно переложить фрукты, не достаточно места!");
        }
    }
}
