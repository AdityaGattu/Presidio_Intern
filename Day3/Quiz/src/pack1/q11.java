package pack1;

abstract class q11 { 
        abstract void amethod(); 
        static int i; 
}
public class Mine extends q11      { 
        public static void main(String argv[]){ 
                        int[] ar=new int[5]; 
                        for(i=0;i < ar.length;i++) 
                                System.out.println(ar[i]); 
                        } 
}

//impltment amethod in inherited class or declared inherited method as abstract.