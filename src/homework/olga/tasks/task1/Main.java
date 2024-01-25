package homework.olga.tasks.task1;

public class Main {

    public static void main(String[] args) {

        Book garry = new Book("GarryPotter", "DJRoyling", 45);

        System.out.println("Книга:" + garry.getTitle() +
                " Возраст:" + garry.getAuthor().getAge() +
                " Имя:" + garry.getAuthor().getName());

    }

}