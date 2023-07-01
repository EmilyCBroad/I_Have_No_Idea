package virtual_pet;

public class VirtualPet {

    private String name;

    private int happiness;

    private int hunger;

    private int thirst;

    private int sickness;

    public VirtualPet(String petName) {
        this.name = petName;
        this.happiness = 0;
        this.hunger = 100;
        this.thirst = 100;
        this.sickness = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getSickness() {
        return this.sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public void play() {
        this.happiness = this.happiness - 5;
        this.hunger = this.hunger + 2;
        this.thirst = this.thirst +3;
    }

    public void feed() {
        this.hunger = this.hunger - 5;
        this.thirst = this.thirst + 2;
    }

    public void water() {
        this.thirst = this.thirst - 5;
    }

    public void takeToVet() {
        this.sickness = this.sickness - 20;
    }

    public void tick() {
        this.happiness = this.happiness +3;
        this.hunger = this.hunger +3;
        this.thirst = this.thirst +3;
        this.sickness = this.sickness +3;
    }

}
