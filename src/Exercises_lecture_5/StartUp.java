import java.util.regex.*;
import java.util.Arrays;

public class StartUp {
    public static void main(String[] args) {
       
        try{
            Student student1 = new Student("ivan@tu-sofia.bg", "123df4");
            System.out.println(student1.getEmail());
            System.out.println(student1.getPassword());

            String StudentEmail = student1.getEmail();
            String name = StudentEmail.substring(0,StudentEmail.indexOf("@"));
            System.out.println(name);
        }
        catch(WrongMailException | WrongPasswordException e){
            e.printStackTrace();

        }

    }
}