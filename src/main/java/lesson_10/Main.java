package lesson_10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Pojo.xml");
//        Pojo pojoinsert = new Pojo("Koval", "Smart", "Old", "987654321");
//        Pojo pojo = (Pojo) context.getBean("Pojo");
//
//        System.out.println(pojo.toString());
//
//        System.out.println(pojo.getClient());
//
//        Pojo slava = (Pojo) context.getBean("slava");
//        System.out.println(slava.toString());
//        ConnectionDB conn = new ConnectionDB((Pojo) context.getBean("slava"));
//        conn.connection();

        Pojo jdbcPojo = new Pojo("MAN", "siemens", "fujitsu", "none");
        PojoJdbcDao jdbcPojoDao = (PojoJdbcDao)context.getBean("jdbcPojoDao");
        jdbcPojoDao.savePojo(jdbcPojo);


    }
}
