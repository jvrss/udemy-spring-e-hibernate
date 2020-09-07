package com.study.app;

import com.study.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeletePacmanCourseDemo {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        // Create session
        Session session = factory.getCurrentSession();

        try{

            // Start a transaction
            session.beginTransaction();

            // get the pacman corse from db
            int courseId = 10;
            Course tempCourse = session.get(Course.class, courseId);

            // delete the course
            System.out.println("Deleting course: " + tempCourse);

            session.delete(tempCourse);

            // Commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            // add clean up code
            session.close();

            factory.close();
        }

    }

}
