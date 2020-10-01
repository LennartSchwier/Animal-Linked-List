package de.neuefische.lennart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void testAddAnimal() {
        // GIVEN
        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("bird");
        Animal animal4 = new Animal("sheep");

        // WHEN
        AnimalListItem head = new AnimalListItem(animal1);
        head.addAnimal(animal2);
        AnimalListItem actualNext = head.getNext();
        Animal actualValue = actualNext.getValue();

        // THEN
        assertNotNull(actualNext);
        assertEquals(animal2, actualValue);
    }

    @Test
    void testAddTwoAnimals() {
        // GIVEN
        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("bird");
        Animal animal4 = new Animal("sheep");

        // WHEN
        AnimalListItem head = new AnimalListItem(animal1);
        head.addAnimal(animal2);
        head.addAnimal(animal3);
        AnimalListItem animalNextNext = head.getNext().getNext();
        Animal actualValue = animalNextNext.getValue();

        // THEN
        assertNotNull(animalNextNext);
        assertEquals(animal3, actualValue);
    }

    @Test
    void testToString() {
        // GIVEN
        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("bird");
        Animal animal4 = new Animal("sheep");
        AnimalListItem head = new AnimalListItem(animal1);
        head.addAnimal(animal2);
        head.addAnimal(animal3);
        head.addAnimal(animal4);

        // WHEN
        String result = head.toString();

        // THEN
        assertEquals("cat -> dog -> bird -> sheep", result);
    }
}