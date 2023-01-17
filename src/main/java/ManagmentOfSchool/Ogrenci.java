package ManagmentOfSchool;

import java.util.Scanner;

public class Ogrenci {



    public static void ogrenci() {


//        Islem1.onames = List.of("Ayse","Ece","Eda");
//        Islem1.okimlik = List.of("987","986","985");
//        Islem1.ogrenciNo = List.of("123","124","125");
//        Islem1.oyas = List.of(10,11,11);
//        Islem1.sinif = List.of("10A","10A","10A");


        Scanner scan = new Scanner(System.in);
        String secim = "";
        System.out.println("====== İŞLEMLER ======");

        do {
            System.out.println("1-EKLEME\n" +
                    "2-ARAMA\n" +
                    "3-LİSTELEME\n" +
                    "4-SİLME\n" +
                    "5-ANA MENÜ\n" +
                    "Q-ÇIKIŞ\n");
            secim = scan.next();

            if (secim.equals("1")){
                Islem1.ekleme();
            }else if (secim.equals("2")){
                Islem1.arama();
            }else if (secim.equals("3")) {
                Islem1.listele();
            }else if (secim.equals("4")){
                Islem1.silme();
            }else if (secim.equals("5")){
                Introduction.intro();
            }else if (secim.equalsIgnoreCase("q")){
                Introduction.slowPrint("Iyi gunler dileriz ",65);
                break;
            }

        } while (!(secim.equals("1")||secim.equals("2")||secim.equals("3")||secim.equals("4")));

    }





}
