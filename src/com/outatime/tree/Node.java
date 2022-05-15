package com.outatime.tree;

public class Node {
    private Integer value;
    private Node left;
    private Node right;

    /*
    Constructor
     */
    public Node(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /*
    Getters and setters
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    /*
    Methods
     */
    public void insert(Integer nodeValue){
        if(nodeValue < this.value){
            if(this.left == null){
                this.left = new Node(nodeValue);
            } else {
                this.left.insert(nodeValue);
            }
        } else {
            if(this.right == null){
                this.right = new Node(nodeValue);
            } else {
                this.right.insert(nodeValue);
            }
        }
    }
}
