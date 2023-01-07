public class main{
    public static void main(String[] args){
        student obj=new student();
        obj.setName("Mujtaba");
        obj.setAge(23);
        obj.setMarks(70);

        System.out.println("Student name is: "+obj.getName()+" and age is:  "+obj.getAge()+" and obtain marks is: "+obj.getMarks());
    }
}