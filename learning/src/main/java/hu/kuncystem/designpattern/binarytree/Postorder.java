package hu.kuncystem.designpattern.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  O(n) - worsth case O(h)
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 20, 2018
 *  
 * @version 1.0
 */
public class Postorder {
    private Queue<Node> stack = null;
    
    //Not testing yet!!!!!
    public Postorder() {}
    
    public void recursive(Node root) {
        if(root != null) {
            recursive(root.left);
            recursive(root.right);
            System.out.println(root.data);
        }
    }
    
    public void iterative(Node root) {
        if(root == null) return;
        Node current = root;
        stack = new LinkedList<Node>();
        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.offer(current);
                current = current.left;
            }else {
                Node temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.poll();
                    System.out.println(temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.poll();
                        System.out.println(temp.data);
                    }
                }else {
                    current = temp;
                }
            }
        }
        
    }
}
