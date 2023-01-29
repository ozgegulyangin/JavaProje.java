package gun45;

public class s11_2 {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");   //çıktı: A B D E
                if (arr[i][j].equals("B")) {
                    break;      // döngüyü kırdı!!
                }
            }
            continue;// etkisi yok ççünkü kendisinden sonra gelen kod yok
        }
    }
}
