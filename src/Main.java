import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;
        int armutkg, elmakg, domateskg, muzkg, patlicankg;
        Scanner inp= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? :");
        armutkg=inp.nextInt();
        System.out.print("Elma Kaç Kilo? :");
        elmakg=inp.nextInt();
        System.out.print("Domates Kaç kilo? :");
        domateskg=inp.nextInt();
        System.out.print("Muz Kaç Kilo? :");
        muzkg=inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo? :");
        patlicankg=inp.nextInt();

        double  toplam= (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg) + (patlican*patlicankg);
        System.out.println("Toplam Tutar : "+toplam+" TL");


    }
}
