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
                "name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }

    public static class Builder {
        // Обязательные параметры
        private String name = null;
        private int age = 0;
        // Дополнительные параметры - инициализируются значениями по умолчанию
        private int salary = 0;


//        public Builder(int servingSize, int servings) {
//            this.servingSize = servingSize;
//            this.servings = servings;
//        }

        public Builder setName (String  name){
            this.name = name;
            return this;
        }

        public Builder setAge (int age){
             this.age = age;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public MyPojo build() {
            return new MyPojo(this);
        }
    }


}