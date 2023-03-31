public class Gorilla extends Mammal{

    public void throwSomething() {
        System.out.println("El gorila ha lanzado algo.");
        setEnergyLevel(getEnergyLevel()-5);
    }
    public void eatBananas() {
        System.out.println("El gorila esta satisfecho");
        setEnergyLevel(getEnergyLevel()+10);
    }
    public void climb() {
        System.out.println("El gorila ha trepado a la cima de un arbol");
        setEnergyLevel(getEnergyLevel()-10);
    }
    Gorilla() {
        setEnergyLevel(20);
    }
}
