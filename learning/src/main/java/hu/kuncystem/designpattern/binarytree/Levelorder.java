package hu.kuncystem.designpattern.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue - O(n) - worsth case n/2
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 20, 2018
 *  
 * @version 1.0
 */
public class Levelorder {
    private Queue<Node> stack;
    
    public void recursive(Node root) {
        
    }
    
    public void iterative(Node root) {
        if(root == null) return;
        stack = new LinkedList<>();
        stack.add(root);
        
        while(stack.isEmpty()) {
            root = stack.poll();
            System.out.println(root.data);
            if(root.left != null) {
                stack.add(root.left);
            }
            if(root.right != null) {
                stack.add(root.right);
            }
        }
    }
}
