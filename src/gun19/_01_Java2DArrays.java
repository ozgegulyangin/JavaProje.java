package gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        // int [][] tablo= new int[2][3];

        int [][]tablo= {
                {1,2,3},
                {4,5,6}
        };
        // tek boyutlu dizilerde dizi uzunluğunu bulmak için dizi.lenght kullanıyorduk

        System.out.println("satır uzunluğu = " + tablo.length);
        System.out.println("0. satırdaki sütun uzunluğu = " + tablo[0].length);
        System.out.println("1. satırdaki sütun uzunluğu = " + tablo[1].length);

        for (int i = 0; i < tablo.length; i++) { // satır sayısı, uzunluğu
            for (int j = 0; j < tablo[i].length; j++) { // ilgili satırdaki sütun uzunluğu
                System.out.print(tablo[i][j] + "\t");

            }
            System.out.println();
        }


    }
}
