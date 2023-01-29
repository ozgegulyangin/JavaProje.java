package gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.


        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[2][3];
        // burası okuma işlemi
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("sayı giriniz=");
                tablo[satir][sutun] = oku.nextInt();
            }
        }
        // burası yazma işlemi
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun] + "\t");
            }
            System.out.println();
        }
        // en büyük sayıyı bulma işlemi
        int enB = tablo[0][0]; // tabloya kendisinin içinden ilk eleman atıyoruz ki negatifte pozitifte girilse kontrol etsin
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {

                if (tablo[satir][sutun] > enB) {
                    enB = tablo[satir][sutun];
                }
            }

            }
            System.out.println("enb = " + enB);

        }

    }