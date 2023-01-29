package gun45;

public class s02 {
    public static void main(String[] args) {
        String names []={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        try{
            for (String n:names)
            {
                pwd[idx]=n.substring(2,6);  // omas, pwd[0]=omas , pwd[1]=null  , pwd[2]=null
                idx++;
            }

        }catch (Exception e){
            System.out.println("Invalid name");}
        for (String p:pwd) {
            System.out.println(p);
       // çıktı :Invalid name
            //omas
            //null
            //null
        }
    }
}
