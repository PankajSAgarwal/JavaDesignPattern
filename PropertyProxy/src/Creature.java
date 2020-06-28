public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public int getAgility() {
        return agility.getValue();
    }

    public void setAgility(int value) {
        agility.setValue(value);
    }
}
