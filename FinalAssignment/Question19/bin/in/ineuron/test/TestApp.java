import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Create a Hibernate SessionFactory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // Open a Hibernate Session
        Session session = sessionFactory.openSession();

        // Create a new Person object
        Person person = new Person();
        person.setName("John Doe");

        // Insert the person into the database using Hibernate
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();

        // Retrieve data using Hibernate
        List<Person> people = session.createQuery("FROM Person", Person.class).list();

        // Display the retrieved data
        for (Person p : people) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName());
        }

        // Close the Hibernate Session and SessionFactory
        session.close();
        sessionFactory.close();
    }
}
