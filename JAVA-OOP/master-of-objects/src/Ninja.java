public class Ninja extends Human{
    public void steal (Human human){
        human.setHealth(human.getHealth()-getStealth());
        setHealth(getHealth()+getStealth());
    }
    public void runAway() {
        setHealth(getHealth()-10);
    }

    public Ninja() {
        setStealth(10);
    }
}
