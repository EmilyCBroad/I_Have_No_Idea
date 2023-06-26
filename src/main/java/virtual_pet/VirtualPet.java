package virtual_pet;

public class VirtualPet {

    private String name;

    private int happiness;

    private int hunger;

    private int thirst;

    private int boredom;

    private int sickness;

    public VirtualPet(String petName, int levelHappiness, int levelHunger, int levelThirst, int levelBoredom, int levelSickness) {
        this.name = petName;
        this.happiness = levelHappiness;
        this.hunger = levelHunger;
        this.thirst = levelThirst;
        this.boredom = levelBoredom;
        this.sickness = levelSickness;
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

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getSickness() {
        return this.sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }
}
