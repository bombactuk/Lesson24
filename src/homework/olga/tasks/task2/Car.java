package homework.olga.tasks.task2;

import java.util.Objects;

public class Car {

    private String model;
    private int years;
    private Engine engine;

    public Car(){
    }

    public Car(String model, int years, String type, int power){
        this.model=model;
        this.years=years;
        this.engine = new Engine(type,power);
    }

    public void informationDisplay(){
        System.out.println("Модель:"+model+" Год:"+years+" Тип:"+ engine.type+" Мощность:"+ engine.power);
    }

    public class Engine{

        private String type;
        private int power;

        public Engine() {
        }

        public Engine(String type, int power){
            this.type=type;
            this.power=power;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return years == car.years && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, years, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", years=" + years +
                ", engine=" + engine +
                '}';
    }

}
