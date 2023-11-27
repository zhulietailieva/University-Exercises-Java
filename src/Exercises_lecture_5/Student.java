/*
package EX5;
import java.util.regex.*;
public class Student{
    private String email; //smalki@tu-sofia.bg
    private String password; //pone5 bez empty space
    static Pattern mail=Pattern.compile("[a-z_-]+[@tu]+[-sofia]+[.bg]+$");
    static Pattern pass=Pattern.compile("[a-zA-z1-9_-]\\S");


    public String getEmail() {
        return email;

    }

    public void setEmail(String email) throws WrongMailException{
        Matcher matcher = mail.matcher(email);

        if(matcher.matches()==false)
        {
            throw new WrongMailException("Wrong email format!");
        }

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordException{

        Matcher matcher2 = pass.matcher(password);
        if(matcher2.matches() == false)
        {
            throw new WrongPasswordException("Password cannot have empty spaces!");
        }
        this.password = password;

    }

    public Student(String username, String password) throws WrongPasswordException, WrongMailException {
        setEmail(email);
        setPassword(password);
    }
}
*/
package EX5;
import java.util.regex.*;

public class Student {
    private String email; // Example: smalki@tu-sofia.bg
    private String password; // Should not contain empty spaces
    static Pattern mail = Pattern.compile("[a-z_-]+[@tu]+[-sofia]+[.bg]+$");
    static Pattern pass = Pattern.compile("\\S+");

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws WrongMailException {
        Matcher matcher = mail.matcher(email);

        if (!matcher.matches()) {
            throw new WrongMailException("Wrong email format!");
        }

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordException {
        Matcher matcher2 = pass.matcher(password);
        if (!matcher2.matches()) {
            throw new WrongPasswordException("Password cannot have empty spaces!");
        }
        this.password = password;
    }

    public Student(String email, String password) throws WrongPasswordException, WrongMailException {
        setEmail(email);
        setPassword(password);
    }
}
