package Poglavlje5;
public class SimulationHeadsOrTails5_40 {
    public static void main(String[] args) {


        System.out.println("Simulacija padanja novcica na pismo ili glavu. ");

        int pismo = 0;
        int glava = 0;

        for (int i = 0; i < 1000000; i++) {
            int novcic = (int) (Math.random() * 2);

            if (novcic == 0) {
                pismo++;
            }
            else glava++;
        }

        System.out.println("U milion bacanja novcic: " +
                "\nPismo: "+pismo+"" +
                "\nGlava: "+glava);
    }
}
