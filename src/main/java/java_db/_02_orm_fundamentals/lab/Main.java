package java_db._02_orm_fundamentals.lab;

import java_db._02_orm_fundamentals.lab.entities.Order;
import java_db._02_orm_fundamentals.lab.entities.User;
import java_db._02_orm_fundamentals.lab.orm.EntityManager;
import java_db._02_orm_fundamentals.lab.orm.MyConnector;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        User user = new User("Noev", "goodluck", 36, LocalDate.now());
        Order order = new Order(26.5, LocalDate.now());
        MyConnector.createConnection("root", "Looneytunes1!", "mini_orm");
        Connection connection = MyConnector.getConnection();
        EntityManager<User> userEm = new EntityManager<>(connection);
        EntityManager<Order> orderEm = new EntityManager<>(connection);
        userEm.persist(user);
        orderEm.persist(order);
        User found = userEm.findFirst(User.class, "id=1");
        System.out.println(found.getAge());
    }
}
