package pack1;

public class q2 {

        public static void main(String arguments[]) { 
                amethod(arguments); 
                } //Cannot make a static reference to the non-static method amethod(String[])
        public void amethod(String[] arguments) { 
                System.out.println(arguments); 
                System.out.println(arguments[1]); 
        } 

}
