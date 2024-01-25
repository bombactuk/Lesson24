package homework.olga.tasks.task3;

public class University {

    public University(){}

    public static class Student{
        private int index;
        private String fio;

        public Student(){}

        public Student(int index, String fio){
            this.index=index;
            this.fio=fio;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }

    }

}