package gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = {
                {4, 5},
                {45, 6, 77},
                {4, 2, 999, 45, 56, 66},
                {42, 12, 9},
                {4},
        };

        System.out.println("satır uzunluğu = " + tablo.length);
        System.out.println("0. satırdaki sütun uzunluğu = " + tablo[0].length);
        System.out.println("1. satırdaki sütun uzunluğu = " + tablo[1].length);
        System.out.println("2. satırdaki sütun uzunluğu = " + tablo[2].length);
        System.out.println("3. satırdaki sütun uzunluğu = " + tablo[3].length);
        System.out.println("4. satırdaki sütun uzunluğu = " + tablo[4].length);

        // yazdırma bölümü
        for (int i = 0; i < tablo.length; i++) { // satır sayısı, uzunluğu
            for (int j = 0; j < tablo[i].length; j++) { // ilgili satırdaki sütun uzunluğu
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }




    }
}
