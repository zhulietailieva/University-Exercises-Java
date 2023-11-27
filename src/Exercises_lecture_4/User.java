public class User {

    private String username;
    private String password;

    public User(String username, String password) throws UserNullException, UserEmptyException{

        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws UserNullException, UserEmptyException{
        if (username==null){

            throw new UserNullException("Username cannot be NULL.");

        }
        if (username=="") {

            throw new UserEmptyException("Username cannot be empty.");
        }
        this.username = username;
    }

    public String getPassword() {


        return password;
    }

    public void setPassword(String password) throws UserEmptyException, UserNullException{

        if (password == null){

            throw new UserNullException("Password cannot be NULL.");

        }
        if (password == ""){

            throw new UserEmptyException("Password cannot be empty.");

        }
        this.password = password;
    }



}
