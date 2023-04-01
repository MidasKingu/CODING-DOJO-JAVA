public class Human {
    private  Integer strength = 3;
    private  Integer intelligence = 3;
    private  Integer stealth = 3;
    private  Integer health = 100;

    public void attack(Human human) {
        human.health -= this.strength;
    }
    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
