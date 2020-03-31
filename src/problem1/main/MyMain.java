package problem1.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        menuFunction();
    }

    public static void menuFunction() {
        boolean turnOff = false;
        Scanner tell = new Scanner(System.in);
        MyBinarySearchTree<Integer> familyMember = new MyBinarySearchTree();
        while (turnOff != true) {
            System.out.println("\nEnter the choice from Menu : \n" +
                    "\n1.Add a new record\n" +
                    "2.Print record's\n" +
                    "3.Delete record's\n" +
                    "4.Search record's\n" +
                    "5.Exit\n");
            System.out.print("Enter the choice : ");

            switch (tell.nextInt()) {
                case 1 -> {
                    System.out.print("\nAdd new member : ");
                    familyMember.add(tell.nextInt());
                }
                case 2 -> {
                    System.out.print("\nleft Member of family : ");
                    familyMember.traverse();
                }
                case 3 -> {
                    System.out.print("\nEnter the Number : ");
                    familyMember.remove(tell.nextInt());
                }
                case 4 -> {
                    System.out.print("\nEnter the number to search For : ");
                    boolean found = familyMember.search(tell.nextInt());
                    if (found) {
                        System.out.println("Sorry member have not found");
                    } else {
                        System.out.println("Your member have been found");
                    }
                }
                case 5 -> turnOff = true;
                default -> throw new IllegalStateException("\nInvalid Input:");
            }
        }
    }
}