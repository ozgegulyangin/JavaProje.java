package gun15;


public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int c=1; c<=5; c++) {
            for (int i = 0; i < c; i++)
                System.out.print("*");
            System.out.println();
        }
        for (int c=5; c>=1; c--) {
            for (int i = 0; i < c; i++)
                System.out.print("*");
            System.out.println();
        }

    }
}
