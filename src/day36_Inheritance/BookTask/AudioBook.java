package day36_Inheritance.BookTask;

public class AudioBook extends Book{


    private String length, narrator;

    public void setInfo(String title, String type, String author, double price, String length, String narrator){
        setInfo(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }


    public void listen(){
        System.out.println("Listening to "+getTitle());
    }

}
