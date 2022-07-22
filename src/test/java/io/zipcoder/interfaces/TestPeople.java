package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {
//    Person newPerson = new Person("Mario", 33333);
    People<Person> personPeople = new People<>();

    @Test
    public void testAdd() {
        personPeople.add(new Person("Mario", 33333));

        assertFalse(personPeople.personList.isEmpty());
        assertSame("Mario",personPeople.personList.get(0).getName());
    }

    @Test
    public void testFindById() {
        personPeople.add(new Person("Luigi", 77777));
        long expectedId = 77777;
        String expectedName = "Luigi";

        assertNotNull(personPeople.findById(expectedId));
        assertSame(expectedName,personPeople.personList.get(0).getName());
        assertEquals(expectedId, personPeople.personList.get(0).getId());
    }

    @Test
    public void testRemove() {
        personPeople.add(new Person("Toad", 98765));
        personPeople.add(new Person("Wario", 12345));
        byte expectedListSize = 1;
        String expectedName = "Toad";
        long expectedId = 12345;

        personPeople.remove(12345);
        assertEquals(expectedListSize, personPeople.personList.size()); //equal list size
        assertSame(expectedName, personPeople.personList.get(0).getName()); //correct person name return
    }

}