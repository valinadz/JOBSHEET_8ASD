package Pakaian;

import java.util.Scanner;

public class StackMain22 {
    public static void main(String[] args) {
        Stack22 stk = new Stack22(5);
        Scanner sc = new Scanner(System.in);
        char pilih;

        do {
            System.out.println("\nMenu Operasi Stack:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi yang diinginkan (1-5): ");
            int opsi = sc.nextInt();
            sc.nextLine();  // Membuang newline karakter setelah nextInt()

            switch (opsi) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();  // Membuang newline karakter setelah nextDouble()

                    Pakaian22 p = new Pakaian22(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    System.exit(0); // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih operasi yang benar (1-5).");
            }

            System.out.print("\nApakah Anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();  // Membuang newline karakter setelah next()
        } while (pilih == 'y');

        sc.close();
    }
}
