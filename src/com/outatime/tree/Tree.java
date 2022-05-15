package com.outatime.tree;

public class Tree {
    Node start;

    /*
    Constructor
     */
    public Tree() {
        this.start = null;
    }

    /*
    Methods
     */
    public void insert(Integer value){
        if(this.start == null){
            this.start = new Node(value);
        } else {
            this.start.insert(value);
        }
    }

    public Boolean isSymmetric(Node root){
        if(root == null){
            return true;
        }

        return isSymmetricInternal(root.getLeft(), root.getRight());
    }

    public Boolean isSymmetricInternal(Node left, Node right){
        Boolean result = false;

        if(left == null && right == null){
            result = true;
        }

        if(left != null && right != null){
            result = (left.getValue() == right.getValue())
                    && isSymmetricInternal(left.getLeft(), right.getRight())
                    && isSymmetricInternal(left.getRight(), right.getLeft());
        }

        return result;
    }
}
