import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri Oluştur mesut
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımlayalım

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce= inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

      int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

      double ort = toplam / 6;
      System.out.println( "Ortalamanız : " + ort);

      String durum = (ort>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
      System.out.println(durum);





    }
}
