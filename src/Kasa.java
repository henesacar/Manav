import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {
    double elma =3.67;
    double armut = 2.14;
    double domates = 1.11;
    double muz = 0.95;
    double patlican = 5.00;
    Scanner scn = new Scanner(System.in);
        System.out.print("Aldığınız elma miktarını KG cinsinden giriniz: ");
        double elmaTutar = scn.nextDouble()*elma;
        System.out.print("Aldığınız armut miktarını KG cinsinden giriniz: ");
        double armutTutar = scn.nextDouble()*armut;
        System.out.print("Aldığınız domates miktarını KG cinsinden giriniz: ");
        double domTutar = scn.nextDouble()*domates;
        System.out.print("Aldığınız muz miktarını KG cinsinden giriniz: ");
        double muzTutar = scn.nextDouble()*muz;
        System.out.print("Aldığınız patlican miktarını KG cinsinden giriniz: ");
    double patlicanTutar = scn.nextDouble()*patlican;
    double toplam = elmaTutar+armutTutar+domTutar+muzTutar+patlicanTutar;
        System.out.println("Toplam tutar: " +toplam);
    }
}
