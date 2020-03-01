package com.study.app;

import com.study.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        // Create session
        Session session = factory.getCurrentSession();

        try{
            // Start a transaction
            session.beginTransaction();

            // Query students
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            // Display the students
            displayStudents(theStudents);

            // Query students: lastName='Doe'
            theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();

            // Display the students
            System.out.println("\n\nStudents who have last name of Doe");
            displayStudents(theStudents);

            // Query students: lastName='Doe' OR firstName='Daffy'
            theStudents = session.createQuery("from Student s " +
                    "where s.lastName='Doe' OR s.firstName='Daffy'").getResultList();

            // Display the students
            System.out.println("\n\nStudents who have last name of Doe or first name Daffy");
            displayStudents(theStudents);

            // Query students where email LIKE '%gmail.com'
            theStudents = session.createQuery("from Student s where" +
                    " s.email LIKE '%gmail.com' ").getResultList();

            System.out.println("\n\nStudents who email ends with gmail.com");
            displayStudents(theStudents);

            // Commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }

    private static void displayStudents(List<Student> theStudents) {
        for (Student tempStudent :
                theStudents) {
            System.out.println(tempStudent);
        }
    }

}
