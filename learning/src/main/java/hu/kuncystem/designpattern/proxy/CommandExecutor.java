package hu.kuncystem.designpattern.proxy;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class CommandExecutor implements Command {
    
    public CommandExecutor() {}
    
    public void run(String cmd) {
        System.out.println("Running the command: " + cmd);
    }

}
