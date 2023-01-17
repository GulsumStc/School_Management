package ManagmentOfSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Islem {


    static List<String> names = new ArrayList<>();
    static List<String> kimlik = new ArrayList<>();
    static List<String> bolumler = new ArrayList<>();
    static List<Integer> yaslar = new ArrayList<>();
    static List<String> sicil = new ArrayList<>();


    static String tamamDevam = "";
    public static void ekleme() {

        String devamTamam = "";
        boolean a = false;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Ogremenin ismini ve soy ismini giriniz");
            String isim = scan.nextLine();
            System.out.println("Kimlik No giriniz");
            String kimlikNo = scan.next();
            System.out.println("Bolum giriniz");
            String bolum = scan.next();
            System.out.println("Yasini giriniz");
            int yas = scan.nextInt();
            System.out.println("Sicil No giriniz");
            String sicilNo = scan.next();
            names.add(isim);
            kimlik.add(kimlikNo);
            bolumler.add(bolum);
            yaslar.add(yas);
            sicil.add(sicilNo);

            Introduction.slowPrint("Kisi bilgileri Listeye eklendi", 50);
            System.out.println();
            System.out.println(names.get(names.indexOf(isim)) + "  -" + kimlik.get(kimlik.indexOf(kimlikNo)) + "-  <" + bolumler.get(bolumler.indexOf(bolum)) +
                    ">  '" + yaslar.get(yaslar.indexOf(yas)) + "'  -" + sicil.get(sicil.indexOf(sicilNo))+"- ");

            System.out.println("Baska kisi eklemek istiyorsaniz 'q' istemiyorsaniz herhangi bir tusa basiniz...");
            devamTamam = scan.next();

            if (devamTamam.equalsIgnoreCase("q")) {
                a = true;
            } else {

                Introduction.slowPrint("Cikis yapiliyor... Ana Sayfaya yonlendiriliyorsunuz\n", 80);
                Introduction.intro();
                break;
            }

        } while (true);


    }
    public static void arama() {

        Scanner scan = new Scanner(System.in);

        int counter = 0;
        boolean isRight = false;
      do {
          System.out.println("Arama Yapmak istediginiz kisinin kimlik nosunu giriniz.");
          String arananK = scan.next();
          if (arananK.replaceAll("[A-Za-z]","").replaceAll("[\\p{Punct}]","").length()!=arananK.length()){
              System.out.println("Kimlik No Harf ve noktalama isratleri iceremez");

          }

              for (int i = 0; i < names.size(); i++) {

                  if (arananK.equals(kimlik.get(i))) {

                      System.out.println("Aranan kisi: ");
                      System.out.println("Isim: "+ names.get(i) + " Kimlik No: "+ kimlik.get(i) + " Bolum: " + bolumler.get(i) +
                              " Yas: " + yaslar.get(i) + " Sicil: " + sicil.get(i));
                      counter++;

                  }

              }
        if (counter==0){
            System.out.println(arananK + " nolu kimlik numarasina sahip ogretmen yoktur.");

        }
                System.out.println("Arama icin:  1\n Ana menu icin: '2'\nCiskis icin: 'q' ya basiniz");
                arananK = scan.next();

            switch (arananK) {
                case "1":
                    isRight = true;
                    break;
                case "2":
                    Introduction.intro();
                case "q":
                    System.out.println("Iyi gunler Dileriz");
                    break;
                default:
                    System.out.println("Tanimsiz islem");
                    isRight = true;
                    break;
            }

        }while (isRight);
    }

    public static void listele(){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i< names.size(); i++){
            System.out.println("Isim: "+ names.get(i) + " Kimlik No: "+ kimlik.get(i) + " Bolum: " + bolumler.get(i) +
                    " Yas: " + yaslar.get(i) + " Sicil: " + sicil.get(i));
        }
        System.out.println("Ana menu icin: '1'\nCiskis icin: 'q' ya basiniz");
        tamamDevam = scan.next();

        switch (tamamDevam) {
            case "1":
                Introduction.intro();
            case "q":
                System.out.println("Iyi gunler Dileriz");
                break;
            default:
                System.out.println("Tanimsiz islem");
                break;
        }

    }

    public static void silme(){

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        boolean isRight = false;
        do {

            System.out.println("Silmek istediginiz kisinin kimlik nosunu giriniz.");

            for (int i = 0; i< names.size(); i++){
                System.out.println("Isim: "+ names.get(i) + " Kimlik No: "+ kimlik.get(i) + " Bolum: " + bolumler.get(i) +
                        " Yas: " + yaslar.get(i) + " Sicil: " + sicil.get(i));
            }
            tamamDevam = scan.next();

            for (int i = 0; i < names.size(); i++) {

                if (tamamDevam.equals(kimlik.get(i))) {

                    System.out.println("Isim: "+ names.get(i) + " Kimlik No: "+ kimlik.get(i) + " Bolum: " + bolumler.get(i) +
                            " Yas: " + yaslar.get(i) + " Sicil: " + sicil.get(i));
                    names.remove(i);
                    kimlik.remove(i);
                    bolumler.remove(i);
                    yaslar.remove(i);
                    sicil.remove(i);

                    counter++;
                    System.out.println("kisi silindi.");

                     break;
                }
                i--;
            }
            if (counter==0){
                System.out.println(tamamDevam + " nolu kimlik numarasina sahip kisi bulunamadi");
            }
            boolean secenek = false;
           do {
             secenek=false;
               System.out.println("Yeni kisi silmek  icin:  1\nAna menu icin: '2'\nListenin son hali icin: 3\n Ciskis icin: 'q' ya basiniz");
               tamamDevam= scan.next();

               switch (tamamDevam) {
                   case "1":
                       isRight = true;
                       break;
                   case "2":
                       Introduction.intro();
                   case "q":
                       System.out.println("Iyi gunler Dileriz");
                       break;
                   case "3":
                       listele();
                   default:
                       System.out.println("Tanimsiz islem");
                       secenek = true;
                       break;
               }

           }while (secenek);

        }while (isRight);




    }
}










