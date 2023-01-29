package gun45;

public class s06 {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers=new int[4];  // int number  ==>   önceki [0][1]'i almaz .. default değer 1. ve 2. kutuyu 0-0 alır
        numbers[2]=30;
        numbers[3]=40;
        for (int x:numbers) {
            System.out.print(" "+x);    // Çıktı:0 0 30 40
        }

    }
}
