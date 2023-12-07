package Week10.Inheritance;

public class User {
    private String name,email;
    private int connum;

    User(String name,String email, int connum){
        this.name = name;
        this.email = email;
        this.connum = connum;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setConnum(int connum){
        this.connum = connum;
    }
    public String getName(String name){
        return name;
    }
    public String getEmail(String email){
        return email;
    }
    public int getConnum(int connum){
        return connum;
    }




    @Override
    public String toString(){
        return String.format("Name: %s Email: %s Contact Number %d", name,email,connum);
    }
}
