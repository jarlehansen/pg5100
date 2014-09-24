package no.nith.pg5100;

import no.nith.pg5100.entity.one_to_many.MyOrder;
import no.nith.pg5100.entity.one_to_one.Customer;
import no.nith.pg5100.many_to_many.Course;
import no.nith.pg5100.many_to_many.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("relationship-mapping");
        EntityManager entityManager = factory.createEntityManager();

        // One to one
        Customer customer = entityManager.find(Customer.class, 1);
        System.out.println(customer);

        // One to many
        MyOrder myOrder = entityManager.find(MyOrder.class, 1);
        System.out.println(myOrder);

        // Many to many
        Course course = entityManager.find(Course.class, 123);
        List<Student> students = course.getStudents();
        System.out.println(students.get(0).getName());

        Student student = entityManager.find(Student.class, 321);
        List<Course> courses = student.getCourses();
        System.out.println(courses.get(0).getTitle());

        entityManager.close();
        factory.close();
    }
}
