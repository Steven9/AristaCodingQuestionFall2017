public class SumPaths {
    public static void main(String[] args) {
        testSanity();
        // Write some more test cases
        testExampleTree();
        testExampleTree2();
        testExampleTree3();
    }

    private static void testSanity() {
        Node root = new Node(1);

        int res = root.sumPaths();
        int expected = 1;

        if (res == expected) {
            System.out.println("Test one passed!");
        } else {
            System.out.println("Test one failed; expected " + expected + " but got " + res + " instead.");
        }
    }

    private static void testExampleTree() {
        Node root = new Node(1);
        root.setRight(new Node(5));
        root.setLeft(new Node(4));
        root.left().setLeft(new Node(3));
        root.left().setRight(new Node(7));
        root.left().right().setRight(new Node(9));

        int res = root.sumPaths();
        int expected = 1637;

        if (res == expected) {
            System.out.println("Test Example Tree passed!");
        } else {
            System.out.println("Test Example Tree failed; expected " + expected + " but got " + res + " instead.");
        }
    }

    // Tree that starts with 0.
    private static void testExampleTree2() {
        Node root = new Node(0);
        root.setLeft(new Node(1));
        root.setRight(new Node(2));
        root.left().setLeft(new Node(3));
        root.left().setRight(new Node(4));
        root.right().setLeft(new Node(5));
        root.right().setRight(new Node(6));

        int res = root.sumPaths();
        int expected = 78;

        if (res == expected) {
            System.out.println("Test Example Tree 2 passed!");
        } else {
            System.out.println("Test Example Tree 2 failed; expected " + expected + " but got " + res + " instead.");
        }
    }

    //Tree that ends with 0.
    private static void testExampleTree3() {
        Node root = new Node(1);
        root.setRight(new Node(1));
        root.right().setLeft(new Node(0));
        root.right().setRight(new Node(0));

        int res = root.sumPaths();
        int expected = 220;

        if (res == expected) {
            System.out.println("Test Example Tree 3 passed!");
        } else {
            System.out.println("Test Example Tree 3 failed; expected " + expected + " but got " + res + " instead.");
        }
    }
}
