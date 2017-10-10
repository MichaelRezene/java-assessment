public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName)throws IllegalArgumentException{
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public  String sayHello() {
        Person p = new Person(firstName,lastName);
             p.setFirstName("Genesis");
            p.setLastName("Mehert");
          return firstName + lastName;

    }
}
