package de.neuefische.lennart;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public void addAnimal(Animal value) {
        if (next == null) {
            AnimalListItem newListItem = new AnimalListItem(value);
            next = newListItem;
        } else {
            next.addAnimal(value);
        }
    }

    @Override
    public String toString() {
        String result = value.getSpecies();
        while (next != null) {
            result += " -> " + next.getValue().getSpecies();
            next = next.getNext();
        }

        return result;
    }
}
