public abstract class Fruit {

    private final String name;
    private final float weight;

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
}
