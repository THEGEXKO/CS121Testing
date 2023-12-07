package ClassACtivity;


public class ClassTester {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        Class1 Tesla = new Class1("Tesla","Z Class",2002);
        Tesla.DisplayInfo();

        Class2 Square = new Class2(3.5,6.1, 21.35);
        Square.displayInfo();
    }
}
