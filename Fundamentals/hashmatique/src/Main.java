public class Main {
    public static void main(String[] args) {


        Hashmatique hashmatique = new Hashmatique();
        hashmatique.getSong("Rap God");
        System.out.println("\n\n\n");
        hashmatique.trackList.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });
    }
}