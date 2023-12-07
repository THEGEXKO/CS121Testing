package Week16.JSONActivity;

public class Student {
    String name;
    int id;
    String clas;
    Student(String name, int id ,String clas){
        this.name=name;
        this.id=id;
        this.clas=clas;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public String getClas(){
        return clas;
    }
}
