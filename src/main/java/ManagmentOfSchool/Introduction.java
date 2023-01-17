package ManagmentOfSchool;

import java.util.Scanner;

public class Introduction {


    public static void intro(){
//
//        Islem.names =List.of("ALi","Can","Veli");
//        Islem.kimlik= List.of("123","124","125");
//        Islem.sicil = List.of("987","986","985");
//        Islem.bolumler= List.of("Tarih","Felsefe","Turkce");
//        Islem.yaslar = List.of(24,25,28);

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("----------------------------------");

        String secim = "";

        do {

            System.out.println(
                            " ÖĞRENCİ İŞLEMLERİ:  1 \n" +
                            " ÖĞRETMEN İŞLEMLERİ: 2\n" +
                            " ÇIKIŞ:              Q\n");
            secim = scan.next();
            if (secim.equalsIgnoreCase("q")) {

                slowPrint("Cikis yapildi, Iyi gunler dileriz...",70);
                break;
            }

            if (secim.equals("1")) {
                Ogrenci.ogrenci();

            } else if (secim.equals("2")) {

                Ogretmen.ogtermen();

            }else {
                System.out.println("!!! Lutfen dogru bir secim yapiniz");
            }

        } while (!(secim.equals("1") || secim.equals("2") ||secim.equalsIgnoreCase("q")));

    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
