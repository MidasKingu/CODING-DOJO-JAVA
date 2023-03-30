import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projectList = new ArrayList<Project>();
    private Double sum = 0.0;
    public Double getPortfolioCost() {
        Double sum = 0.0;
        for (Project project:projectList) {
            sum += project.getInitialCost();
        }

        return sum;
    }
    public Double getPortfolioCostForEach() {
        setSum(0.0);
        projectList.forEach((project)->{
            setSum((getSum()+project.getInitialCost()));
        });
        return getSum();
    }

    public void showPortfolio() {
        setSum(0.0);
        projectList.forEach((project)->{
            System.out.println(project.elevatorPitch());
        });
        System.out.println(getPortfolioCostForEach());
    }

    public Portfolio(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
