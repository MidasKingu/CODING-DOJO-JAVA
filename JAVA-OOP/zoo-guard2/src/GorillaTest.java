public class GorillaTest {
    public static void main(String[] args) {
        //Instanciar al gorila para hacer que lance algo tres veces, coma dos veces y trepe una vez.
        Gorilla manilla = new Gorilla();
        manilla.displayEnergy();
        manilla.throwSomething();
        manilla.throwSomething();
        manilla.throwSomething();
        manilla.eatBananas();
        manilla.eatBananas();
        manilla.climb();
        manilla.displayEnergy();
    }
}
