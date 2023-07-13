package Poglavlje12;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProcessScoresInATextFile12_14_read {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite naziv dokumenta : ");
        String nazivDoc = input.next();

        Path path = Paths.get(nazivDoc + ".txt");

        int sum = 0;
        int count = 0;

       try {
           Scanner read = new Scanner(path);

           while (read.hasNext()) {
               sum += read.nextInt();
               count++;
           }

           read.close();

           System.out.println("Zbir brojeva u dokumentu je : " + sum);
           System.out.println("Njihov prosjek je : " + (sum / count));

       }catch (Exception ex) {
           System.out.println("Pogresan naziv dokumenta. ");
       }

       input.close();
    }
}
