import TerminalIO.*;

public class MakeEmployees {

    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader(); 
        String name = kr.readLine("Enter Name ->");
        System.out.println("The name is "+name);
        System.out.println("");
    }

}
