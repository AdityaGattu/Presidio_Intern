package pack1;

//Which of the following methods can be legally inserted in place of the comment //Method Here ? 
//class Base{ 
//      public void amethod(int i) {  }
//} 
//public class Scope extends Base{
//        public static void main(String argv[]){
//        } 
//    //Method Here
//}
//1) void amethod(int i) throws Exception {} 
//2) void amethod(long i)throws Exception {} 
//3) void amethod(long i){} 
//4) public void amethod(int i) throws Exception {} 

/*
Objective 4.7) 
2,3 
Options 1, & 4 will not compile as they attempt to throw Exceptions not 
declared in the base class. Because options 2 and 4 take a parameter of type 
long they represent overloading not overriding 
and there is no such limitations on overloaded methods. 
*/