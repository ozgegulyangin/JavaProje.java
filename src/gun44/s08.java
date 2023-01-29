package gun44;

public class s08 {
    public static void main(String[] args) {
        String[] strs={"A","B"};
        int idx=0;

        for (String s:strs){
            strs[idx].concat("element"+ idx);
            //strs[idx]= strs[idx].concat("element"+ idx); böyle olsaydı çıktı A element 0B element 1 olurdu‼️

            // CONCAT DEĞER ATAMAAAAZZZZZZ EŞİTLEMEZSEKKKKK ‼️‼️
            idx++;
        }
        for(idx=0; idx<strs.length;idx++){
            System.out.println(strs[idx]);
    }
}}
