//package Lesson6;
import javax.sound.midi.SysexMessage;

public class LibraryInterface {

    public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia with Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing in the Rain", "Harry Conner");
        b4 = new Book("Good HouseKeeping", "Pat Burns");
        b5 = new Book("To be a Model", "Lisa Lahey");
        System.out.println("Here are ther books available");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        Patron p = new Patron("Miles Davis");
        System.out.println(p);
    }

    //System.out.printIn ("Lending 4 books to "+ p.getName());
    //if(p.borrow (b1)) System.out.println(b1.getTitle() +"successfully borrowed.");
    //else              System.out.println(b1.getTitle() + " could not be borrowed.");
    // if(p.borrow (b2))System.out.println(b2.getTitle() +"successfully borrowed.");
   // else              System.out.println(b2.getTitle() + " could not be borrowed.");
   //  if(p.borrow (b3))System.out.println(b3.getTitle() +"successfully borrowed.");
   // else              System.out.println(b3.getTitle() + " could not be borrowed.");
   //  if(p.borrow (b4))System.out.println(b4.getTitle() +"successfully borrowed.");
   // else              System.out.println(b4.getTitle() + " could not be borrowed.");
    // if(p.borrow (b5))System.out.println(b5.getTitle() +"successfully borrowed.");
   // else              System.out.println(b5.getTitle() + " could not be borrowed.");
}
