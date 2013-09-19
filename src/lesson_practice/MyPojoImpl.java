package lesson_practice;

import lesson_1.MyPojo;

public class MyPojoImpl implements Comparable<MyPojoImpl> {
    private final String name;
    private final int age;
    private final int salary;


//    private MyPojoImpl(Builder builder) {
//        name = builder.getName();
//        age = builder.getAge();
//        salary = builder.getSalary();
//
//    }

   public MyPojoImpl(String name, int age, int salary){
       this.name = name;
       this.age = age;
       this.salary = salary;
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

    @Override
    public String toString() {
        return "MyPojoImpl{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public int compareTo(MyPojoImpl o) {
        if (!name.equals(o.getName()))
            return name.compareTo(o.getName());

        if (age != o.getAge())
            return age - o.getAge();

        if (salary != o.getSalary())
            return salary - o.getSalary();

        return 0;
    }

    public static class Builder {

        private String name = null;
        private int age = 0;

        private int salary = 0;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            if (age != builder.age) return false;
            if (salary != builder.salary) return false;
            if (!name.equals(builder.name)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + age;
            result = 31 * result + salary;
            return result;
        }

        public Builder populate(lesson_1.MyPojo myPojo){
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

//        public MyPojo build() {
//            return new MyPojo(this) {
//                @Override
//                public String getName() {
//                    return null;  //To change body of implemented methods use File | Settings | File Templates.
//                }
//
//                @Override
//                public int getAge() {
//                    return 0;  //To change body of implemented methods use File | Settings | File Templates.
//                }
//
//                @Override
//                public int getSalary() {
//                    return 0;  //To change body of implemented methods use File | Settings | File Templates.
//                }
//            };
//        }
    }



}