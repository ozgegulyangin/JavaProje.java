package gun28._02_Contructor;

public class Book {
    String name;
    int publishYear;
    String author;

    Book(){  //Public Book()'da diyebiliriz.

    }

    Book(String name, int publishYear, String author ){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;

    }
    Book(String name,String author){
        this(name,0,author);

    }
    Book(String name,int publishYear){
        this(name,publishYear," ");
    }

    public String toString() {
        return publishYear==0 ?name+" "+author :name+" "+publishYear+" "+author;
    }
}
