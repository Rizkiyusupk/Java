import java.util.ArrayList;
import java.util.Scanner;
public class asist1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Haii Selamat datang di virtual Asisten Miki :) apa saja yang kamu mau hari ini silahkan pilih:\n1)Kalkulator \n2)To-dol ist");
            String user = scanner1.nextLine();
            if (user.equals("1")) {
                System.out.println("Selamat datang di kalkulator Miki:) Masukan Operator yang anda inginkan +,-,*,/:");
                String user1 = scanner1.nextLine();
                if (user1.equals("+")) {
                    System.out.println("Silahkan masukan angka pertama anda :");
                    int angka1 = scanner1.nextInt();
                    System.out.println("Silahkan masukan angka kedua anda :");
                    int angka2 = scanner1.nextInt();
                    int hasil = angka1 + angka2;
                    System.out.println("hasilnya adalah :"+hasil);
                } else if (user1.equals("-")) {
                    System.out.println("Silahkan masukan angka pertama anda :");
                    int angka1 = scanner1.nextInt();
                    System.out.println("Silahkan masukan angka kedua anda :");
                    int angka2 = scanner1.nextInt();
                    int hasil = angka1 - angka2;
                    System.out.println("hasilnya adalah :"+hasil);
                } else if (user1.equals("*")) {
                    System.out.println("Silahkan masukan angka pertama anda :");
                    int angka1 = scanner1.nextInt();
                    System.out.println("Silahkan masukan angka kedua anda :");
                    int angka2 = scanner1.nextInt();
                    int hasil = angka1 * angka2;
                    System.out.println("hasilnya adalah :"+hasil);
                } else if (user1.equals("/")) {
                    System.out.println("Silahkan masukan angka pertama anda :");
                    int angka1 = scanner1.nextInt();
                    System.out.println("Silahkan masukan angka kedua anda :");
                    int angka2 = scanner1.nextInt();
                    int hasil = angka1 / angka2;
                    System.out.println("hasilnya adalah :"+hasil);
                }
            } else if (user.equals("2")) {
                System.out.println("Selamat datang di To-do list Miki :) silahkan apa saja yang ingin kamu catat :");
                ArrayList<String> Array1 = new ArrayList<>();
                for (int i=0;i<5;i++) {
                    String input = scanner1.nextLine();
                    Array1.add(input);
                }for (int i=0;i<Array1.size();i++) {
                    System.out.println(i+"."+Array1.get(i));
                }
            } scanner1.close();
        }
    }
}
