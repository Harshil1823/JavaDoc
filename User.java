
import java.util.ArrayList;
public class User implements Account{
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    private String password;
    private String userName;
    private ArrayList<Course> grades;
    public ArrayList<User> users;


    public boolean validUsername(String userName){
        return true;
    }
    public boolean validPassword(String password){
        return true;
    }
}
