package gun39._04_OOP_Soru;

class C{
    public C() {
        System.out.println("C");
    }

}
class B extends C{
    public B() {
        //  super(); burada super var ama görünmüyor
        System.out.println("B");
    }
}
class A extends B{
    public A() {
        //  super(); burada super var ama görünmüyor
        System.out.println("A");
    }
}



public class Soru {
    public static void main(String[] args) {

        A a=new A();
        // önce super çalışırr!!
        // önce görünmeyen super ler çalıştığı için
        //  C   B   A yazar
        // önce miras aldığı parent classın mesajını yazar‼️


    }
}
