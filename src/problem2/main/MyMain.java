package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        /**
         * performOperationFunction will print the menu of the available function definition of the performOperationFunction define below this function.
         */
        performOperationFunction();
    }

    private static void performOperationFunction() {
        MyBinarySearchTree<Integer> treeFamily = new MyBinarySearchTree();
        int atLease = 3;
        Scanner tell = new Scanner(System.in);
        System.out.print("How many no do want to add : ");
        atLease = tell.nextInt();
        System.out.println("Enter the no's : ");
        for (int i = 0; i < atLease; i++) {
            treeFamily.add(tell.nextInt());
        }

        System.out.println("Enter the Order\n" +
                "1.preOrder format\n" +
                "2.postOrder format\n");
        int choice = tell.nextInt();

        switch (choice) {
            // here root is first element
            case 1 -> treeFamily.traverseViaOrder(choice);
            // here root is last element
            case 2 -> treeFamily.traverseViaOrder(choice);
        }
    }

}