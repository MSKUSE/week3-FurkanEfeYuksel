public class FindMinimum {
    public static void main(String[] args) {
        int number1= Integer.parseInt(args[0]);
        int number2= Integer.parseInt(args[1]);
        int number3= Integer.parseInt(args[2]);

        boolean num1_min= number1<number2 && number1<number3;
        boolean num2_min= number2<number1 && number2<number3;
        int minimum= num1_min ? number1 : num2_min ? number2: number3;

    }
}
