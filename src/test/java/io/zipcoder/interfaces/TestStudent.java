package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStudent {
    Student student = new Student(null, 0);

    @Test
    public void testImplementation() {
        assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance() {
        assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn() {
        student.learn(5.5);
        Double actualStudyTime = student.getTotalStudyTime();
        assertTrue(5.5== actualStudyTime);
    }

/*
    @Test
    public void testStudentInstanceOfPerson() {
        Student student02 = new Student(null,000);
        assertTrue(student02 instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student03 = new Student(null, 0);


    }
*/

}