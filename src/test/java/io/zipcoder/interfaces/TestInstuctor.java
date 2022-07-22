package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestInstuctor {
    Student student = new Student(null, 0);
    Instuctor instuctor = new Instuctor("Professor Doolittle", 11111);

    @Test
    public void testImplementation() {
        assertTrue(instuctor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        assertTrue(instuctor instanceof Teacher);
    }

    @Test
    public void testTeach() {
//        double numOfHours = 20;
//        Learner[] learners = new Learner[4];
        instuctor.teach(student, 8.5);
        Double actualStudyTime = student.getTotalStudyTime();
        assertTrue(8.5==actualStudyTime);
    }

    @Test
    public void testLecture() {
        double numOfHours = 20.0;
        Learner[] learners = {
                new Student("SpongeBob", 11111),
                new Student("Patrick", 22222),
                new Student("Sandy", 33333),
                new Student("Squidward", 44444)};

        instuctor.lecture(learners, numOfHours);
        Double expectedHoursPerStudent = 5.0;
        Double actualHoursPerStudent = learners[0].getTotalStudyTime();

        assertEquals(expectedHoursPerStudent, actualHoursPerStudent);

    }

}