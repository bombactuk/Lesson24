package homework.olga.tasks.task5;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет Java!");
            }
        };

        greeting.sayHello();

    }

}