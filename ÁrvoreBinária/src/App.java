class Node {
    int valor;
    Node esquerda;
    Node direita;

    public Node(int value) {
        this.valor = value;
        this.esquerda = null;
        this.direita = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = new Node(1);
        this.root.esquerda = new Node(2);
        this.root.direita = new Node(3);
        this.root.esquerda.esquerda = new Node(4);
        this.root.esquerda.direita = new Node(5);
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.esquerda);
            System.out.print(node.valor + " ");
            inOrderTraversal(node.direita);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.inOrderTraversal(tree.root);
    }
}