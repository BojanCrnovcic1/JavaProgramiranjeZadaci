package Poglavlje12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProcessScoresInATextFile12_14_write {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("numbers.txt");

        BufferedWriter writer = Files.newBufferedWriter(path);

        Scanner input = new Scanner(System.in);

        System.out.println("Unosite integere dok ne unesete 0 : ");
        int broj = 0;
        do {
            broj = input.nextInt();
            if (broj != 0) {
                writer.write(broj + " ");
            }
        }while (broj != 0);

        writer.close();
        input.close();
    }
}
