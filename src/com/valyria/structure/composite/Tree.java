package com.valyria.structure.composite;

/**组合模式
 * Created by YuanXiang on 2017/5/22.\
 * 将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树
 */
public class Tree {
    TreeNode root = null;
    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
