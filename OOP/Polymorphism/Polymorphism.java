//compile time polymorphism   
class calculator{
    public int add(int a, int b){
        
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
}
public class Polymorphism{
    public static void main(String[] args){
        calculator obj=new calculator();
        double x=obj.add(10.2, 2.1);
        System.out.println("Your value is "+x);

    }}