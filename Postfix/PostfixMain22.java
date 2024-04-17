package Postfix;

import java.util.Scanner;

public class PostfixMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")"; // Menambahkan ')' sebagai penanda akhir ekspresi

        int total = Q.length();

        Postfix22 post = new Postfix22(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
        sc.close();
    }
}
