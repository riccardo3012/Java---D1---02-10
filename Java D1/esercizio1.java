

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        System.out.println("CIAO");
  esercizioDue.pariODispari();

        esercizioDue.ex2();


    Scanner input=new Scanner(System.in);

    System.out.println("inserisci la prima parola");
    String primoInput=input.nextLine();

        System.out.println("inserisci la seconda parola");
        String secondoInput=input.nextLine();

        System.out.println("inserisci la terza parola");
        String terzoInput=input.nextLine();

        String result =  terzoInput +" " + secondoInput + " " +  primoInput;
        System.out.println("la sequenza è " + primoInput +" " + secondoInput +" " + terzoInput);
        System.out.println("la sequenza al contrario è" + " " + result);

    }
}