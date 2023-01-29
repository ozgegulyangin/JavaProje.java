package gun45;

public class s01_2 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;

        for (String n : names) {
            try {


                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            } catch (Exception e) {
                System.out.println("Invalid name");
            }
            // ÇIKTI   --   omas   -Invalid name-   seph

        }
    }
}
