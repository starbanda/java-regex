package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListManager {
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public void updateElement(List<Integer> list, int oldElement, int newElement) {
        int index = list.indexOf(oldElement);
        if (index != -1) {
            list.set(index, newElement);
        }
    }
}

public class ListManagerTest {
    @Test
    public void shouldAddElementToTheList() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        Assertions.assertTrue(list.contains(10));
    }

    @Test
    public void shouldRemoveElementFromTheList() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        listManager.removeElement(list, 10);
        Assertions.assertFalse(list.contains(10));
    }

    @Test
    public void shouldUpdateElementInTheList() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        listManager.updateElement(list, 10, 20);
        Assertions.assertFalse(list.contains(10));
        Assertions.assertTrue(list.contains(20));
    }
}
