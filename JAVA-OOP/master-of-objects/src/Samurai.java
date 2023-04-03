public class Samurai extends Human{
    public void deathBlow(Human human) {
        human.setHealth(0);
        setHealth(getHealth()/2);
    }
    public void meditate() {
        setHealth(getHealth() + (getHealth()/2));
    }
    public Samurai () {
        setHealth(200);
    }
}
