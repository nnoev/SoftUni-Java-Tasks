package java_db._02_orm_fundamentals.exercises;

import java_db._02_orm_fundamentals.exercises.entities.Order;
import java_db._02_orm_fundamentals.exercises.entities.User;
import java_db._02_orm_fundamentals.exercises.orm.EntityManager;
import java_db._02_orm_fundamentals.exercises.orm.MyConnector;
import java_db._02_orm_fundamentals.exercises.orm.anotations.Column;
import java_db._02_orm_fundamentals.exercises.orm.anotations.Entity;
import java_db._02_orm_fundamentals.exercises.orm.anotations.Id;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        User user = new User("Noev", "goodluck", 36, LocalDate.now());
        Order order = new Order(26.5, LocalDate.now());
        MyConnector.createConnection("root", "Looneytunes1!", "mini_orm");
        Connection connection = MyConnector.getConnection();
        EntityManager<User> userEm = new EntityManager<>(connection);
        EntityManager<Order> orderEm = new EntityManager<>(connection);
        Field[] declaredFields = order.getClass().getDeclaredFields();
        for (Field f:declaredFields){
            System.out.println(f.getName());
            Annotation[] annotations = f.getAnnotations();
            for (Annotation a :annotations){
                System.out.println(a.annotationType().getSimpleName());
            }
        }


    }
}
