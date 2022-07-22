package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;

    Student(String name, long id) {
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime+=numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }


/*
    public Student(String name, long id) {
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {

    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    @Override
    public void learn() {
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }
*/
}
