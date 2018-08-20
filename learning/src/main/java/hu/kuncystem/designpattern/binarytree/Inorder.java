package hu.kuncystem.designpattern.binarytree;

import java.util.Stack;

/**
 * O(n) - worsth case O(h)
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 20, 2018
 *  
 * @version 1.0
 */
public class Inorder {
    private Stack<Node> stack = null;
    
    //Not testing yet!!!!!
    public Inorder() {}
    
    public void recursive(Node root) {
        if(root != null) {
            recursive(root.left);
            System.out.println(root.data);
            recursive(root.right);
        }
    }
    
    public void iterative(Node root) {
        if(root == null) return;
        stack = new Stack<Node>();
        while(true) {
            if(root != null){
                stack.push(root);
                root = root.left;
            }else {
                if(stack.isEmpty()) {
                    break;
                }else {
                    root = stack.pop();
                    System.out.println(root.data);
                    root = root.right;
                }
            }
        }
    }
}
