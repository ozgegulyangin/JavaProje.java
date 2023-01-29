package gun44;

public class s05 {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        for(int e=0; e<5; e+=2){   // 135 çıktısı elde ederiz
            System.out.print(a[e]);
        }
        System.out.println();
        for(int e=1; e<5; e+=2){   // 24 çıktısı elde ederiz
            System.out.print(a[e]);
        }


    }
}
