import java.util.Scanner;

public class BSTProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        
        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Create a binary search tree");
            System.out.println("2. Add a node");
            System.out.println("3. Delete a node");
            System.out.println("4. Print nodes by InOrder");
            System.out.println("5. Print nodes by PreOrder");
            System.out.println("6. Print nodes by PostOrder");
            System.out.println("7. Exit program");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bst.createBalancedBST();
                    System.out.println("Binary Search Tree created with values 1-7");
                    break;

                case 2:
                    System.out.print("Enter value to add: ");
                    int value = scanner.nextInt();
                    bst.insert(value);
                    System.out.println("Node added successfully");
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    bst.delete(value);
                    System.out.println("Node deleted successfully");
                    break;

                case 4:
                    System.out.print("InOrder traversal: ");
                    bst.inOrder();
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine(); 
                    scanner.nextLine(); 
                    break;

                case 5:
                    System.out.print("PreOrder traversal: ");
                    bst.preOrder();
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine(); 
                    scanner.nextLine(); 
                    break;

                case 6:
                    System.out.print("PostOrder traversal: ");
                    bst.postOrder();
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine(); 
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
} 