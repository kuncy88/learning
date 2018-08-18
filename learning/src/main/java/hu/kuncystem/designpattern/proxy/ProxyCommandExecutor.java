package hu.kuncystem.designpattern.proxy;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class ProxyCommandExecutor implements Command{

    private final boolean isAdmin; 
    private final CommandExecutor executor;
    
    public ProxyCommandExecutor(String user) {
        isAdmin = user.equalsIgnoreCase("admin");
        executor = new CommandExecutor();
    }
    
    public void run(String cmd) {
        if(isAdmin) {
            executor.run(cmd);
        }else {
            if(cmd.trim().startsWith("rm") || cmd.trim().startsWith("sudo")) {
                   System.out.println("This command is not allowed for non-admin users!");
            }else {
                executor.run(cmd);
            }
        }
    }

}
