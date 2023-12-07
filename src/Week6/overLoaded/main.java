package Week6.overLoaded;

public class main {
    public static void main(String[] args) {
    Overload num1 = new Overload("Dave","Gobi",34,5.5);
    Overload num2 = new Overload("dave","David",55);
    Overload num3 = new Overload("Kip");

    num2.setName("Graham");
    System.out.println(num2.getName());
    System.out.println(num2.getWord());
    num2.setName("gave","gave");
    System.out.println(num2.getName());
    System.out.println(num2.getWord());
    }
}
