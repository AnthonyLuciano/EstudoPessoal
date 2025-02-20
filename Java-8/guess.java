public class guess {
    public static void main (String args[]) throws java.io.IOException{
        char ch = 'k';
        System.out.println("im thinking of a letter between A and Z");
        System.out.print("can you guess it:");
        
 
        ch = (char) System.in.read();
        if (ch != 'k') {
            System.out.print("sorry, thats not right");
        }
        else {System.out.println("congrats! youre right!");
        }
        
        }
    }
