class Animal{
    public void eat(){
        System.out.println("Animals eats");
    }   
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat bones");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) 
    { 
        Animal obj=new Dog();
        obj.eat();

    }
}
