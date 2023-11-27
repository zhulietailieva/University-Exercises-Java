package EX4;

public class Main {
    public static void main(String[] args) {


        try{
            User user = new User("", "1234");
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }
        catch(UserNullException | UserEmptyException e){
            e.printStackTrace();

        }


    }
}
//suzdayte class user s poleta username i pass, kato username i parola da ne sa null i da ne sa prazni