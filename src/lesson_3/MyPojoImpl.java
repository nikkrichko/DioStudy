package lesson_3;

import lesson_3.Comparator.NameComparator;

import java.util.Comparator;

public class MyPojoImpl implements MyPojo {
    private final String name;
    private final int age;
    private final int salary;
    private final Comparator<MyPojo> comparator;
    private final Size size;

    private MyPojoImpl(Builder builder) {
        size = builder.getSize();
        name = builder.getName();
        age = builder.getAge();
        salary = builder.getSalary();
        comparator = builder.getComparator();
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
    public Comparator<MyPojo> getComparator() {
        return comparator;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyPojoImpl{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPojoImpl myPojo = (MyPojoImpl) o;

        if (age != myPojo.age) return false;
        if (salary != myPojo.salary) return false;
        if (name != null ? !name.equals(myPojo.name) : myPojo.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public int compareTo(MyPojo o) {

//        if (!name.equals(o.getName()))
//            return name.compareTo(o.getName());
//
//        if (age != o.getAge())
//            return age - o.getAge();
//
//        if (salary != o.getSalary())
//            return salary - o.getSalary();

        return comparator.compare(this, o);
    }

    public static class Builder {

        private String name = null;
        private int age = 0;
        private Comparator<MyPojo> comparator = new NameComparator();
        private int salary = 0;
        private Size size;

        public Builder populate(MyPojo myPojo){
            this.name = myPojo.getName();
            this.age = myPojo.getAge();
            this.salary = myPojo.getSalary();
            this.comparator = myPojo.getComparator();
            this.size = myPojo.getSize();
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

        public Builder size(Size size) {
            this.size = size;
            return this;
        }


        public Builder comparator(Comparator<MyPojo> comparator){
            this.comparator = comparator;
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

        public Comparator<MyPojo> getComparator(){
            return comparator;
        }

        public Size getSize() {
            return size;
        }

        public MyPojo build() {
            return new MyPojoImpl(this);
        }
    }



}