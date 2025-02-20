public class booleanDemo {
    public static void main(String[] args) {
        boolean b;

        b = true;
        System.out.println("b is "+ b);
        
        b = false;
        System.out.println("b is "+b);

        if (b == false) {
            System.out.println("nah, thats false.");
        }
        b = true;
        if (b == true) {
            System.out.println("HOLY MOTHERBOARD! THATS TRUE!");
        }

        System.out.println("10 > 9 is "+ (10>9));

    }
}
