
class a{
    
}
class b extends a{
    
}
class c extends a{
    
}
public class testA {
    public static void main(String[] args){
        a A=new b();
        if(A instanceof a)
            System.out.println("a");
        else if(A instanceof b)
            System.out.println("b");
             else if(A instanceof c)
            System.out.println("c");
            else
             System.out.println("no");
            
    }
    
}
