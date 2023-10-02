import java.util.Scanner;


public  class esercizioDue {
    public static int ex2 (){
        Scanner input=new Scanner(System.in);
      int  b=input.nextInt();
      int  h=input.nextInt();
    int result = b*h*2;
        System.out.println("Il perimetro è"+" "+result);
    return result;

    }



public static void pariODispari(){
    System.out.printf("");
    Scanner input=new Scanner(System.in);
    System.out.println("inserisci il numero");
    int  n=input.nextInt();

    if(n%2==0)
        System.out.println("Il numero è paro");
    else  System.out.println("Il perimetro è disparo");
}

public class areaTriangolo {
    public static void main() {
        double lato = 3.5;
        double lato1 = 5.5;
        double lato2 = 8.5;

        double area = calcolaAreaTriangolo(lato1, lato2, lato);
        System.out.println("l'area è di" + " " + area);
    }

    public static double calcolaAreaTriangolo(double lato1, double lato2, double lato) {
        double semiperimetro = (lato1 + lato2 + lato) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato));
        return area;
    }
}
}
