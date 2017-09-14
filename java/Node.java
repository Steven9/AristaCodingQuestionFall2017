class Node {
    private final int value;
    private Node left = null;
    private Node right = null;

    // Constructs Node.
    public Node(int val) {
        this.value = val;
    }

    public Node right() {
        return this.right;
    }

    public Node left() {
        return this.left;
    }

    // Sets Node to the right of current Node.
    public void setRight(Node r) {
        this.right = r;
    }

    // Sets Node to the left of current Node.
    public void setLeft(Node l) {
        this.left = l;
    }

    // Returns value of current Node.
    public int value() {
        return this.value;
    }

    // Returns sum of all numbers created by the
    // paths from the root to each leaf.
    public int sumPaths() {
        return sumPathsHelper(this, 0);
    }

    // Helper function of sumPaths(), Takes in
    // current Node NODE, the result RES is set to be 0.
    public int sumPathsHelper(Node node, int res) {
        // Base case: null tree.
        if (node == null) 
            return -1;

        res = (res * 10 + node.value());

        // Checks if the node is a leaf.
        if (node.left == null && node.right == null)
            return res;

        // Recursion for each case to avoid res - 1 when next node is leaf. 
        if (node.left == null && node.right != null) {
            return sumPathsHelper(node.right, res);
        } else if (node.left != null && node.right == null) {
            return sumPathsHelper(node.left, res);
        } else {
            return sumPathsHelper(node.left, res) + sumPathsHelper(node.right, res);
        }
    }

}
