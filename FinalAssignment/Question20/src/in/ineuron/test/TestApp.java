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

        // Retrieve the person to update
        session.beginTransaction();
        Person person = session.get(Person.class, 1); // Assuming the person with ID 1 exists
        session.getTransaction().commit();

        // Update the person's name
        person.setName("Jane Smith");

        // Save the updated person into the database using Hibernate
        session.beginTransaction();
        session.update(person);
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
