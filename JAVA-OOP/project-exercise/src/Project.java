public class Project {
    private String nombre;
    private String description;
    private Double initialCost;
    public String elevatorPitch() {
        return getNombre()+"("+getInitialCost()+")" + ":"+ getDescription();
    }
    Project() {

    }
    Project(String name) {

    }
    Project(String name, String description) {
        setNombre(name);
        setDescription(description);
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public void setInitialCost (Double initialCost) {
        this.initialCost = initialCost;
    }
    public String getNombre () {
        return this.nombre;
    }
    public String getDescription () {
        return this.description;
    }
    public Double getInitialCost () {
        return this.initialCost;
    }
}