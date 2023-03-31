public class Mammal {
    private Integer energyLevel;

    public Integer displayEnergy(){
        System.out.println("La energia del mamifero es : " +energyLevel);
        return energyLevel;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }
}
