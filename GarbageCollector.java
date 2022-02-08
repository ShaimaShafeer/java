package shaima;

class Test{
    public void finalize(){
        System.out.println("object is garbage collected");
    }  
}
public class GarbageCollector{
    public static void main(String args[]){
        Test s1=new Test();  
        Test s2=new Test();  
        s1=null;  
        s2=null;  
        System.gc();
        s1=s2;s2=s1;
    }
}