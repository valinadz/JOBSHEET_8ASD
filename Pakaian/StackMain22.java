package Pakaian;

import java.util.Scanner;

public class StackMain22 {
    public static void main(String[] args) {
        Stack22 stk = new Stack22(5);
        Scanner sc = new Scanner(System.in);

        char pilih; 
            do {
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

            Pakaian22 p = new Pakaian22(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
            stk.print();
            stk.pop();
            stk.peek();
            stk.print();
        sc.close();
    }
}


