package homework.olga.tasks.task4;

public class Main {
    public static void main(String[] args) {

        MathUtil.Factorial fact = MathUtil.getFactorial(6);

        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());

    }

}
