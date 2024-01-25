package homework.olga.tasks.task7;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape() {

            @Override
            double area(int radius) {
                return Math.PI*Math.pow(radius,2);
            }

        };

        System.out.println("Площадь круга="+shape.area(12));

    }

}


