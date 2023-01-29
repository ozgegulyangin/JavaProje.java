package gun46;

public class s04 {
    public static void main(String[] args) {
        String[][]chs=new String[5][2];
        chs[0]=new String[4];
        chs[1]=new String[5];
        int i=97;

        for (int a= 0; a < chs.length; a++) { //
            for (int b = 0; b < chs.length; b++) {  // ArrayIndexOutOfBoundsException  hatası verir
                chs[a][b]=""+i;   // 00,10,11,,,,,,4,4 e kadar gider   - 0. satırın 4.elemanı YOK!!!
                i++;
            }
        }
        for(String[]ca:chs){
            for(String c:ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
