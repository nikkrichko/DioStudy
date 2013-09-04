package Lesson_1;

public class MyPojo {
    private final String name;
    private final int age;
    private final int Salary;


    private MyPojo(Builder builder) {
        name = builder.name;
        age = builder.age;
        Salary = builder.salary;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return Salary;
    }



    @Override
    public String toString() {
        return "MyPojo{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", Salary=" + getSalary() +
                '}';
    }

    public static class Builder {
        // Обязательные параметры
        private String name = null;
        private int age = 0;
        // Дополнительные параметры - инициализируются значениями по умолчанию
        private int salary = 0;

        public Builder populate(MyPojo myPojo){
            this.name = myPojo.getName();
            this.age = myPojo.getAge();
            this.salary = myPojo.getSalary();
            return this;
        }


        public Builder Name(String name){
            this.name = name;
            return this;
        }

        public Builder Age(int age){
             this.age = age;
            return this;
        }

        public Builder Salary(int salary) {
            this.salary = salary;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        public MyPojo build() {
            return new MyPojo(this);
        }
    }


}