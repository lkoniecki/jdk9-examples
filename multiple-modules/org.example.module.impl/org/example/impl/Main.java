package org.example.impl;

import org.example.DummyDao;
import org.example.DummyEntity;

/**
 * Main class.
 * @author lkoniecki
 */
public class Main {
    public static void main(String[] args) {
        DummyDao dao = new MyDummyDao();
        dao.save(new DummyEntity());
        System.out.println("Saved");
    }
}
