public class Bat extends Mammal {
    public void fly() {
        System.out.println("Sonido de Bat al despegar");
        setEnergyLevel(getEnergyLevel()-50);
    }
    public void eatHumans() {
        System.out.println("Bueno, no importa");
        setEnergyLevel(getEnergyLevel()+25);
    }
    public void attackTown(){
        System.out.println("*Sonido de ciudad en llamas*");
        setEnergyLevel(getEnergyLevel()-100);
    }
    Bat() {
        setEnergyLevel(300);
    }
}
