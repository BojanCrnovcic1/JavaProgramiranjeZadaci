package Poglavlje11;

import Klase.Krug;
import Klase.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UseArrayList11_6 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Date());
        objects.add(new Krug());
        objects.add(new String("objekat string \n"));
        objects.add(new Loan());

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
        }

    }
}
