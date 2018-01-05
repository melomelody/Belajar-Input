import java.util.Scanner;
import java.lang.Math;

public class Coba{
    public static void HitungPersegi(){
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        Double sisi = tes.nextDouble();

        System.out.println("Dengan sisi " +sisi+ "cm, Maka luas persegi tersebut adalah "+(sisi*sisi)/100+" m");
        System.out.println("                                                                                 ");
    }

    public static void HitungPersegiPanjang(){
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang : ");
        Integer panjang = tes.nextInt();
        System.out.print("Masukkan lebar persegi panjang : ");
        Integer lebar = tes.nextInt();


        System.out.println("Dengan panjang " +panjang+ "cm dan lebar " +lebar+", Maka luas persegi panjang tersebut adalah "+(panjang*lebar)+" cm");
        System.out.println("                                                                                 ");
    }

        public static void HitungKelilingLingkaran(){
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        Integer jariJari = tes.nextInt();
    

        System.out.println("Dengan jari-jari " +jariJari+ "cm dan phi " +Math.PI+", Maka Keliling lingkaran tersebut adalah "+(2*Math.PI*jariJari)+" cm");
        System.out.println("                                                                                 ");
    }

    public static void main(String[] args){
        Scanner tes = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("1. Persegi ");
        System.out.println("2. Persegi Panjang ");
        System.out.println("3. Lingkaran ");
        System.out.println("---------------------");
        System.out.print("Pilih : ");
        Integer baru = tes.nextInt();
        if(baru == 1){
            HitungPersegi();
        }else if(baru == 2){
            HitungPersegiPanjang();
        }else if(baru == 3){
            HitungKelilingLingkaran();
        }else{ 
            System.out.println("Pilihan Salah");
        }
        System.out.println("                     ");
    }
}