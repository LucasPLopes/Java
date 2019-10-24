public class BinaryTree {
    Node root;

    public void addNode(int key, User user) {
        Node node = new Node(key, user);
        if (root == null) {
            root = node;
        } else {
            Node focus = root;
            Node parent;

            while (true) {
                parent = focus;
                if (key < focus.getKey()) {
                    focus = focus.left;
                    if (focus == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    focus = focus.right;
                    if (focus == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }
    public void inOrder(Node focus) {
        if (focus != null) {
            inOrder(focus.left);
            System.out.println(focus);
            inOrder(focus.right);
        }
    }

    public void preOrder(Node focus) {
        if (focus != null) {
            System.out.println(focus);
            inOrder(focus.left);            
            inOrder(focus.right);
        }
    }
    public void postOrder(Node focus) {
        if (focus != null) {
            System.out.println(focus);
            inOrder(focus.left);            
            inOrder(focus.right);
            System.out.println(focus);
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.addNode(50, new User("A"));
        bt.addNode(25, new User("B"));
        bt.addNode(15, new User("C"));
        bt.addNode(30, new User("D"));
        bt.addNode(75, new User("E"));
        System.out.println("In Order:");
        bt.inOrder(bt.root);
        System.out.println("Pre Order:");
        bt.preOrder(bt.root);
        System.out.println("Post Order:");
        bt.postOrder(bt.root);
    }

    
    private class Node {
        private User user;
        private int key;
        Node left;
        Node right;

        public Node(int key, User user) {
            this.user = user;
            this.key = key;
        }

        public String toString() {
            return "User: " + user.getName() + " has " + key;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

    }

}
