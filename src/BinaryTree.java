public class BinaryTree {
    private class Node{
        private int value;
        private Node left,right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void add(int v){
        this.root = add(root,v);
    }

    private Node add(Node node,int value){
        if ( node == null){
            return new Node(value);
        }
        if (value<node.value){
            node.left = add(node.left,value);
        }else if (value>node.value){
            node.right = add(node.right,value);
        }
        return node;
    }
    public int max(){
        if(root == null){
            throw new NullPointerException("Empty");
        }
        return max(root);
    }
    private int max(Node node){
        while( node.right != null){
            node = node.right;
        }
        return node.value;
    }

    public int min(){
        if(root == null){
            throw new NullPointerException("Empty");
        }
        return min(root);
    }
    private int min(Node node){
        while( node.left!= null){
            node = node.left;
        }
        return node.value;
    }


}
