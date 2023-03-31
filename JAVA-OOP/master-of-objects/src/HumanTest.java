public class HumanTest {
    public static void main(String[] args) {
        Human leo = new Human();
        Human gerard = new Human();
        gerard.attack(leo);
        System.out.println(leo.getHealth());
        System.out.println(gerard.getHealth());
    }
}
