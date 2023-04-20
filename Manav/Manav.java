import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int armut, elma, domates, muz, patlican;
        System.out.print("Armut Kg : ");
        armut = input.nextInt();
        System.out.print("Elma Kg : ");
        elma = input.nextInt();
        System.out.print("Domates Kg : ");
        domates = input.nextInt();
        System.out.print("Muz Kg : ");
        muz = input.nextInt();
        System.out.print("Patlıcan Kg : ");
        patlican = input.nextInt();
        double Tutar = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5.0);

        System.out.println("Toplam Tutar : " + Tutar);

        /**
         * @author Erdem AYDEMİR.
         */



    }
}
