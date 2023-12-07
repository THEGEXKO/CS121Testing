package Week10.Inheritance;

public class Customer extends User {
    Customer(String name, String email, int connum) {
        super(name, email, connum);
    }

    public String pastrev;

    public void setPastrev(String pastrev) {
        this.pastrev= pastrev;
    }
    public String getPastrev(String pastrev){
        return pastrev;
    }

    @Override
    public String toString(){
        return String.format("Name: %s Email: %s Contact Number %d Past reservations: %s", getName("Tom"),getEmail("TomB@gmail.com"),getConnum(315-333-3333),getPastrev("Table of 4 at 4:30"));
    }
}