public class Wizard extends Human{
    public void heal(Human humano) {
        humano.setHealth(humano.getHealth() + getIntelligence());
    }
    public void fireBall(Human human) {
        human.setHealth(human.getHealth()-getIntelligence()*3);
    }
    public Wizard() {
        setHealth(50);
        setIntelligence(8);
    }
}
