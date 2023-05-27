package Poglavlje4;

public class GenerateVehiclePlateNumbers4_25 {
    public static void main(String[] args) {

        System.out.println("Random registarski broj vozila : ");

        int slovo1 = 65+ (int) (Math.random() * (91 - 65));
        int slovo2 = 65+ (int) (Math.random() * (91 - 65));
        int slovo3 = 65+ (int) (Math.random() * (91 - 65));
        int broj1 = (int) (Math.random() * 10);
        int broj2 = (int) (Math.random() * 10);
        int broj3 = (int) (Math.random() * 10);
        int broj4 = (int) (Math.random() * 10);

        System.out.println(" "+(char)slovo1+(char)slovo2+(char)slovo3+broj1+broj2+broj3+broj4);
    }
}
