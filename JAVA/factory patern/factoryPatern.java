import java.util.Scanner;

class factoryPatern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Object type:");
        String name=scanner.nextLine();
        createObj.getObject(name);

    }
    class createObj{
        public I1 getObject(String typeOfObject)
        {
            I1 obj=null;
            String name=typeOfObject.toLowerCase();
            if(name=='student'){
                obj=new Student();

            }
            else{
                obj=new Teacher();
            }
          
        }
    }
    public interface I1{
        String getname();
        String getfname();
    }
    class Teacher implements I1 {
        public String getname(){
            return "Teacher name";
        }
        public String getfname(){
            return "Teacher father saab name";
        }
    }
    class Student implements I1{
        public String getname(){
            return "Student name";
        }
        public String getfname(){
            return "Student father saab name";
        }
    }
}