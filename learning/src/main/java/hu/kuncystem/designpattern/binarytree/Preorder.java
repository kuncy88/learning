package hu.kuncystem.designpattern.binarytree;

import java.util.Stack;

/**
 * LIFO - Stack O(n) - worsth case O(h)
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 20, 2018
 *  
 * @version 1.0
 */
public class Preorder {
    private Stack<Node> s = null;
    
    //Not testing yet!!!!!
    public Preorder() {}
    
    public void recursive(Node root) {
        if(root != null) {
            System.out.println(root.data);
            recursive(root.left);
            recursive(root.right);
        }
    }
    
    public void iterative(Node root) {
        if(root == null) return;
        s = new Stack<Node>();
        
        s.add(root);
        while(!s.isEmpty()) {
            root = s.pop();
            System.out.println(root.data);
            if(root.right != null) {
                s.push(root.right);
            }
            if(root.left != null) {
                s.push(root.left);
            }
        }
    }
}
