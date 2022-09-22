import java.util.Scanner;

public class sinif_gecme {
    public static void main(String[] args) {

        //dersleri tanımla
        int matematik, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);


        //Tek tek tüm ders notlarının kullanıcı tarafından girilmesini sağla
        System.out.print("Matematik Notunuzu giriniz:");
        matematik = input.nextInt();
            if (matematik<0 || matematik>100) {
                matematik = 0;
            }

        System.out.print("Fizik Notunuzu giriniz:");
        fizik = input.nextInt();
            if (fizik<0 || fizik>100) {
                fizik = 0;
            }
        System.out.print("Türkçe Notunuzu giriniz:");
        turkce = input.nextInt();
            if (turkce<0 || turkce>100) {
                turkce = 0;
             }
        System.out.print("Kimya Notunuzu giriniz:");
        kimya = input.nextInt();
            if (kimya<0 || kimya>100) {
                kimya = 0;
              }
        System.out.print("Müzik Notunuzu giriniz:");
        muzik = input.nextInt();
            if (muzik<0 || muzik>100) {
                 muzik = 0;
             }

        double average = (matematik + fizik + turkce + kimya + muzik)/5;

        //Geçme kalma koşulu
        if (average <= 55) {

            System.out.print("Sınıfta kaldınız:");
            System.out.println("Not ortalamanız kaldınız:" + average);
        }


        else {

            System.out.print("Sınıfı geçtiniz:");
            System.out.println("Not ortalamanız kaldınız:" + average);

        }

        }

    }

