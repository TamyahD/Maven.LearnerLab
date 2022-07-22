package io.zipcoder.interfaces;

public class Instuctor extends Person implements Teacher{
    Instuctor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/ learners.length;
        for (Learner l : learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
