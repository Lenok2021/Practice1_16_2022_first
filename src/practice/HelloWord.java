package practice;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello word"); // this is a print statement
        System.out.println("------------------------------------------");

        int a=3;
        int d=5;
        int result = sumNumbers(a,d);
    }
    private static int sumNumbers(int a, int b){
        return a+b;
    }
}
