package Week6.overLoaded;

public class Overload {
    String name, word;
    Integer number;
    Double GPA;
    Overload(String name,String word,Integer number,Double GPA){
        this.name=name;
        this.word=word;
        this.number=number;
        this.GPA=GPA;

    }
    Overload(String name){
        this.name=name;
    }
    Overload(String name, String word, Integer number){
        this.name=name;
        this.word=word;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public String getWord(){
        return word;
    }
    public Integer getNumber(){
        return number;
    }
    public double getGPA(){
        return GPA;
    }







    public void setName(String name){
        this.name=name;
    }

    public void setWord(String Word){
        this.word=word;
    }
    public void setNumber(Integer number){
        this.number=number;
    }
    public void setGPA(Double GPA){
        this.GPA=GPA;
    }
    public void setName(String name, String word){
        this.name=name;
        this.word=word;
        if(name.equals(word)){
            System.out.println("What?");
        }
    }
}

