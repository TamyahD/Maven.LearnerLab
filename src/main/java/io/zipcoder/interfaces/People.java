package io.zipcoder.interfaces;

import java.util.*;

public class People<Thing extends Person> implements Iterable<Thing>{
    List<Thing> personList = new ArrayList<>();


    public void add(Thing person) {
        personList.add(person);
    }

    public Thing findById(long id) {
        for (Thing p : personList) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.removeIf(p -> p == person);
    }

    public void remove(long id) {
        personList.removeIf(p -> p.getId() == id);

/*
        for (Thing p :personList) {
            if (p.getId() ==id) {
                personList.remove(p);
            }
        }
*/
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

//    public Thing[] toArray() {
//        return personList.toArray(new Thing[0]);
//    }

    @Override
    public Iterator<Thing> iterator() {
        return personList.iterator();
    }
}
