import java.util.Scanner;
public class hitungVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di kalkulator Hitung volume bangun :\n1)Kubus\n2)Balok\n3)Tabung\n4)Kerucut");   
        String user = scanner.nextLine();
        if (user.equals("1")) {
            Kubus.volumer();
        }else if (user.equals("2")) {
            Balok.balok();
        }else if (user.equals("3")) {
            tabung.volume();
        }else if (user.equals("4")) {
            kerucut.volume();
        }scanner.close();
    }
    public class Kubus {
        public static void volumer() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukan sisi dari kubus mu :");
            double sisi1 = scanner.nextDouble();
            System.out.println("Masukan sisi dari kubus mu :");
            double sisi2 = scanner.nextDouble();
            System.out.println("Masukan sisi dari kubus mu :");
            double sisi3 = scanner.nextDouble();
            double hasil = sisi1 * sisi2 * sisi3;
            System.out.println(hasil);
            scanner.close();
        }
     }
     public class Balok {
        public static void balok() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukan Panjang :");
            double panjang = scanner.nextDouble();
            System.out.println("Masukan Lebar :");
            double lebar = scanner.nextDouble();
            System.out.println("Masukan tinggi :");
            double tinggi = scanner.nextDouble();
            double hasil = panjang * lebar * tinggi;
            System.out.println(hasil);
            scanner.close();
        }
     }
     public class tabung {
        public static void volume() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Silahkan pilih phi mu :\n1)22/7\n2)3.14");
            String user = scanner.nextLine();
            if (user.equals("1")) {
                System.out.println("Masukan jari jari mu :");
                double jari1 =scanner.nextDouble();
                System.out.println("Masukan tinggi mu :");
                double tinggi = scanner.nextDouble();
                double hasil = 22/7 * jari1 * jari1 * tinggi;
                System.out.println(hasil);
                scanner.close();
            }else if (user.equals("2")) {
                System.out.println("Masukan jari jari mu :");
                double jari1 =scanner.nextDouble();
                System.out.println("Masukan tinggi mu :");
                double tinggi = scanner.nextDouble();
                double hasil = 3.14 * jari1 * jari1 * tinggi;
                System.out.println(hasil);
                scanner.close();
            }
        }
     }
     public class kerucut {
        public static void volume() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Silahkan pilih phi mu :\n1)22/7\n2)3.14");
            String user = scanner.nextLine();
            if (user.equals("1")) {
                System.out.println("Masukan jari jari mu :");
                double jari1 = scanner.nextDouble();
                System.out.println("Masukan tinggi mu :");
                double tinggi = scanner.nextDouble();
                double hasil = 1/3 * 22/7 *jari1 *jari1 *tinggi;
                System.out.println(hasil);
                scanner.close();
            }else if (user.equals("2")) {
                System.out.println("Masukan jari jari mu :");
                double jari1 = scanner.nextDouble();
                System.out.println("Masukan tinggi mu :");
                double tinggi = scanner.nextDouble();
                double hasil = 1/3 * 3.14 *jari1 *jari1 *tinggi;
                System.out.println(hasil);
                scanner.close();
            }
        }
     }

}
