package Poglavlje12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteReadData12_15 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Exercise12_15.txt");

        BufferedWriter writer = Files.newBufferedWriter(path);

        for (int i = 0; i < 100; i++) {
            int randomNumb = (int) (Math.random() * 100) + 1;
            writer.write(randomNumb + " ");
        }
        writer.close();

        List<Integer> brojevi = new ArrayList<>();

        Scanner read = new Scanner(path);

        while (read.hasNext()) {
            brojevi.add(read.nextInt());
        }

        int count = 0;

        for (Integer broj : brojevi) {
            System.out.print(broj + " ");
            count++;
            if (count == 15) {
                System.out.println();
                count = 0;
            }
        }
        read.close();
    }
}

