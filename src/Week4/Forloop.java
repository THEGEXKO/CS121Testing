package Week4;

public class Forloop {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        for (int num = 0; num < numbers.length; num++) {
            System.out.println(numbers[num]);
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for(int i = 1; i<= 10;i++){
            if(i % 2 ==0)
                System.out.println(i);
        }
        System.out.println();
    }
}