package com.study.app;

import com.study.model.Course;
import com.study.model.Instructor;
import com.study.model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        // Create session
        Session session = factory.getCurrentSession();

        try{

            // Start a transaction
            session.beginTransaction();

            // option 2: Hibernate query with HQL

            // Get the instructor from db
            int theId = 1;

            Query<Instructor> query =
                    session.createQuery("select i from Instructor i "
                                    + "JOIN FETCH i.courses "
                                    + "where i.id=:theInstructorId",
                            Instructor.class);

            // set parameter on query
            query.setParameter("theInstructorId", theId);

            // execute query and get instructor
            Instructor tempInstructor = query.getSingleResult();

            System.out.println("luv2code: Instructor: " + tempInstructor);

            // Commit transaction
            session.getTransaction().commit();

            //close the session
            session.close();

            System.out.println("\nluv2code: The session is now closed!\n");

            // Get courses for the instructor
            System.out.println("luv2code: Courses: " + tempInstructor.getCourses());

            System.out.println("luv2code: Done!");
        } finally {
            // add clean up code
            session.close();

            factory.close();
        }

    }

}
