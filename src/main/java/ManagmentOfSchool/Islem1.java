package ManagmentOfSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islem1 {




    static List<String> onames = new ArrayList<>();
    static  List<String> okimlik = new ArrayList<>();
    static List<String > ogrenciNo = new ArrayList<>();
    static  List<Integer> oyas = new ArrayList<>();
    static List<String> sinif = new ArrayList<>();



    static String tamamDevam = "";
    public static void ekleme() {

        String devamTamam = "";
        boolean a = false;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Ogrencinin ismini ve soy ismini giriniz");
            String isim = scan.nextLine();
            System.out.println("Kimlik Numarasini giriniz");
            String kimlikNo = scan.next();
            System.out.println("Ogrenci Numarasini giriniz");
            String ogrenciN = scan.next();
            System.out.println("Yasini giriniz");
            int yas = scan.nextInt();
            System.out.println("Sinif  giriniz");
            String sinifNo = scan.next();
            onames.add(isim);
            okimlik.add(kimlikNo);
            ogrenciNo.add(ogrenciN);
            oyas.add(yas);
            sinif.add(sinifNo);

            Introduction.slowPrint("Kisi bilgileri Listeye eklendi", 50);
            System.out.println();
            System.out.println(onames.get(onames.indexOf(isim)) + "  -" + okimlik.get(okimlik.indexOf(kimlikNo)) + "-  <" +
                               ogrenciNo.get(ogrenciNo.indexOf(ogrenciN)) + ">  '" + oyas.get(oyas.indexOf(yas)) + "'  -" + sinif.get(sinif.indexOf(sinifNo))+"- ");

            System.out.println("Baska kisi eklemek istiyorsaniz 'y' Islemlere donmek icin 't' istemiyorsaniz herhangi bir tusa basiniz...");
            devamTamam = scan.next();

            if (devamTamam.equalsIgnoreCase("y")) {
                a = true;
            } else if (devamTamam.equalsIgnoreCase("t")) {
                Ogrenci.ogrenci();
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
                System.out.println("Kimlik numarasi harf ve noktalama isratleri iceremez");
                isRight=true;
                break;

            }

            for (int i = 0; i <onames.size(); i++) {

                if (arananK.equals(okimlik.get(i))) {

                    System.out.println("Aranan kisi: ");
                    System.out.println("Isim: "+ onames.get(i) + " Kimlik No: "+ okimlik.get(i) + " Ogrenci Numarasi: " + ogrenciNo.get(i) +
                            " Yas: " + oyas.get(i) + " Sinif: " + sinif.get(i));
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

        for (int i = 0; i< onames.size(); i++){
            System.out.println("Isim: "+ onames.get(i) + " Kimlik No: "+ okimlik.get(i) + " Ogrenci Numarasi: " + ogrenciNo.get(i) +
                    " Yas: " + oyas.get(i) + " Sinif: " + sinif.get(i));
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
                Ogrenci.ogrenci();
                break;
        }

    }

    public static void silme() {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        boolean isRight = false;

        do {

            System.out.println("Silmek istediginiz kisinin kimlik nosunu giriniz.");

            for (int i = 0; i < onames.size(); i++) {
                System.out.println("Isim: " + onames.get(i) + " Kimlik No: " + okimlik.get(i) + " Ogrenci Numarasi: " +ogrenciNo.get(i) +
                        " Yas: " + oyas.get(i) + " Sinif: " + sinif.get(i));
            }
            tamamDevam = scan.next();

            for (int i = 0; i < onames.size(); i++) {

                if (tamamDevam.equals(okimlik.get(i))) {

                    System.out.println("Isim: " + onames.get(i) + " Kimlik No: " + okimlik.get(i) + " Ogrenci Numarasi: " +ogrenciNo.get(i) +
                                       " Yas: " + oyas.get(i) + " Sinif: " + sinif.get(i));
                    onames.remove(onames.get(i));
                    okimlik.remove(okimlik.get(i));
                    ogrenciNo.remove(ogrenciNo.get(i));
                    oyas.remove(oyas.get(i));
                    sinif.remove(sinif.get(i));

                    counter++;
                    System.out.println("kisi silindi.");
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(tamamDevam + " nolu kimlik numarasina sahip kisi bulunamadi");
            }
            boolean secenek = false;
            do {
                secenek = false;
                System.out.println("Yeni kisi silmek  icin:  1\nAna menu icin: '2'\nListenin son hali icin: 3\n Ciskis icin: 'q' ya basiniz");
                tamamDevam = scan.next();

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

            } while (secenek);

        } while (isRight);


    }

}
