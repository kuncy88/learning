package hu.kuncystem.designpattern.proxy;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We use this pattern, if we want to control the access of a functionality. In
 * this example, we have an interface with run method. We have the
 * CommandExecutor which running all of the commands. We created the
 * {@link ProxyCommandExecutor} which control the access of the command.
 * 
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Proxy implements PatternTest {

    public void test() {
        ProxyCommandExecutor exec = new ProxyCommandExecutor("admin");
        exec.run("sudo apt-get update");
        exec.run("ls -la");

        exec = new ProxyCommandExecutor("kuncy");
        exec.run("sudo apt-get update");
        exec.run("ls -la");
    }

}
