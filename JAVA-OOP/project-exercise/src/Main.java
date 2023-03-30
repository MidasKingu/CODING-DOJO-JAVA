import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Project project = new Project("Suscriptor","Tu Saas de manejo de suscripciones.",100.0);

        System.out.println(project.elevatorPitch());
        Project projectLeo = new Project("Leoche","Bueraskrr",50.0);
        Project projectDani = new Project("Dani","Um amigo",100.0);

        ArrayList<Project> proyectos= new ArrayList<Project>();

        proyectos.add(projectDani);
        proyectos.add(projectLeo);
        proyectos.add(project);

        Portfolio portafolioAmigos = new Portfolio(proyectos);

        System.out.println(portafolioAmigos.getPortfolioCostForEach());
        System.out.println("\n\n\n\n");
        portafolioAmigos.showPortfolio();

    }

}