package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class RentProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rent? ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ":" + rooms[i]);
            }
        }

        sc.close();
    }
}
