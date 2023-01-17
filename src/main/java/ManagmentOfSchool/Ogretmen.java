package ManagmentOfSchool;

import java.util.Scanner;

public class Ogretmen {


        /*
          3.  Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
    ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         5-ANA MENÜ
         Q-ÇIKIŞ


           4.  İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
        ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
        Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
         */
    public static void main(String[] args) {


    }

    public static void ogtermen() {

//        Islem.names = List.of("ALi", "Veli", "Can");
//        Islem.kimlik= List.of("123","124","125");
//        Islem.sicil = List.of("987","986","985");
//        Islem.bolumler= List.of("Tarih","Felsefe","Turkce");
//        Islem.yaslar = List.of(24,25,28);

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
                      Islem.ekleme();
            }else if (secim.equals("2")){
                      Islem.arama();
            }else if (secim.equals("3")) {
                      Islem.listele();
            }else if (secim.equals("4")){
                      Islem.silme();
            }else if (secim.equals("5")){
                      Introduction.intro();
            }else if (secim.equalsIgnoreCase("q")){
                Introduction.slowPrint("Iyi gunler dileriz ",65);
                break;
            }

        } while (!(secim.equals("1")||secim.equals("2")||secim.equals("3")||secim.equals("4")));

    }


}


