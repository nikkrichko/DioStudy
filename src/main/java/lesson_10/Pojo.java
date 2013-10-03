package lesson_10;

public class Pojo {
    private String client;
    private String phone;
    private String pc;
    private String salary;

    public Pojo(String client, String phone, String pc, String salary) {
        this.client = client;
        this.phone = phone;
        this.pc = pc;
        this.salary = salary;
    }
    public Pojo(){}

    public void setClient(String client) {
        this.client = client;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getClient() {
        return client;
    }

    public String getPhone() {
        return phone;
    }

    public String getPc() {
        return pc;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Pojo{ " +
                "client='" + client + '\'' +
                ", phone='" + phone + '\'' +
                ", pc='" + pc + '\'' +
                ", salary=" + salary +
                '}';
    }
}
