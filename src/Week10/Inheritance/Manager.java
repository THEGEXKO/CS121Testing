package Week10.Inheritance;

public class Manager extends User{
    Manager(String name, String email, int connum) {
        super(name, email, connum);
    }
    public String menuman;
    public void setMenuman(String menuman){
        this.menuman=menuman;
    }
    public String getMenuman(String menuman){
        return menuman;
    }
    public String toString(){
        return String.format("Name: %s Email: %s Contact Number %d, Menu changes: %s", getName("Jeff"),getEmail("JeffR@gmail.com"),getConnum(232-232-2332),menuman);
    }
}
