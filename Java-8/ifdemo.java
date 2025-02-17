public class ifdemo {
    public static void main(String args[]){
        int a,b,c;

        a=2;
        b=3;
        
        if (a < b) {
            System.out.println("a is lesser then b");
        }
        
        c = a - b;

        if (c <= 0) {
            System.out.println("c contains " + c);
            System.out.println("c is negative");
        }
        System.out.println("");

        c = a + b;

        if (c >= 0) {
            System.out.println("c contains " + c);
            System.out.println("c is positive");
        }
        
        
        
    }

}
