package gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar= {"Halk Tv", "Fox Tv", "Disney Channel", "Cartoon Network","Number 1"};
        int randomSayi= (int)(Math.random()*(kanallar.length));
        System.out.println("kanal=" + kanallar[randomSayi]);



    }
}
