package com.valyria.structure.composite;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new LinkedList<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node){
        children.add(node);
    }

    public void remove(TreeNode node){
        children.remove(node);
    }

    public TreeNode getChildren(int index){
        return children.get(index);
    }
}
