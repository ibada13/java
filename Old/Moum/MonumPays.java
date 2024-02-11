package Moum;

import java.util.ArrayList;
import java.util.Scanner;

public class MonumPays {
    private String Country;
    private ArrayList<Moum> Moum = new ArrayList<Moum>();
    Scanner Scan = new Scanner(System.in);

    public void Read() {
        int i;
        System.out.println("enter the name of the country : ");
        Country = Scan.nextLine();
        do {
            System.out.println("enter 1 for moum and 2 for moumrenvoi : ");
            i = Scan.nextInt();
            if (i == 1) {
                Moum moum = new Moum();
                moum.read();
                this.Moum.add(moum);
            } else if (i == 2) {
                MonRenové mon = new MonRenové();
                mon.read();
                this.Moum.add(mon);

            }
        } while (i != 1 && i != 2);

    }

    public void afficher() {
        System.out.println("the country is : ");
        for (Moum i : this.Moum) {
            System.out.println("moument : " + i.toString());
        }
    }

    public void ajouter(Moum m) {
        this.Moum.add(m);
    }
}
