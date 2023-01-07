interface calc{
    int add(int a, int b);
    int subtract(int a, int b);
}
class calculator implements calc {
    public int add(int a, int b){
        System.out.println(" Addition is "+(a+b));
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

}
public class Abstraction{
    public static void main(String[] args){
        calculator obj=new calculator();
        obj.add(10, 2);
      
    }
}
