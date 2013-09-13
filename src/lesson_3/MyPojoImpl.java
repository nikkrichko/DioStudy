package lesson_3;

public class MyPojoImpl implements MyPojo {
    private final String name;
    private final int age;
    private final int salary;


    private MyPojoImpl(Builder builder) {
        name = builder.getName();
        age = builder.getAge();
        salary = builder.getSalary();

    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "MyPojoImpl{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }

    public static class Builder {

        private String name = null;
        private int age = 0;

        private int salary = 0;

        public Builder populate(MyPojo myPojo){
            this.name = myPojo.getName();
            this.age = myPojo.getAge();
            this.salary = myPojo.getSalary();
            return this;
        }


        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
             this.age = age;
            return this;
        }

        public Builder salary(int salary) {
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
            return new MyPojoImpl(this);
        }
    }



}