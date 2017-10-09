public class User extends Person {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin)
            throws IllegalArgumentException {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }
    public boolean isAdmin(){
        return false;
    }
}
