package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    Person person = new Person("Borat", 011222);

    @Test
    public void testPersonConstructor() {
        String expectedName = "Borat";
        long expectedID = 011222;
        String actualName = person.getName();
        long actualID = person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedID, expectedID);
        Assert.assertNotNull(person);
    }

    @Test
    public void getId() {
        long expectedID = 011222;
        long actualID = person.getId();

        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void getName() {
        String expected= "Java the Hutt";
        Person person = new Person(expected, 0);
        String actual = person.getName();

        Assert.assertSame(expected, actual);

    }

    @Test
    public void setName() {
        String newName = "Java the Hutt";
        person.setName(newName);
        String actualName = person.getName();

        Assert.assertSame(newName, actualName);
    }
}
