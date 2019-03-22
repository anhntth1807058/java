package main;

import entity.Game;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên game: ");
        String name = scanner.nextLine();
        Game game = new Game();
        game.setName(name);
        System.out.println(game.toString());
    }
}
