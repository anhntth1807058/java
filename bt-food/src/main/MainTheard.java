package main;

import entity.MenuCreator;

public class MainTheard {

    public static void main(String[] args) {
        MenuCreator menuCreator = new MenuCreator();
        menuCreator.createMenu();
    }
}
