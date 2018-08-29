package hu.kuncystem.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 21, 2018
 *  
 * @version 1.0
 */
public class ClassTest {
    //package, class, subclass, world
    public String publicVar = "ClassTest.publicVar";
    //package, class, subclass
    protected String protectedVar = "ClassTest.protectedVar";
    //class
    private String privateVar = "ClassTest.privateVar";
    //package, class
    String defaultVar = "ClassTest.defaultVar";
    
    public ClassTest(){
        System.out.println(StaticClassFinal1.varStaticFinal);
        StaticClassFinal1.log();
    }
    
    public static String varStaticFinal = "ClassTest.varStaticFinal";  
    private static Map varStaticFinal2 = new HashMap();  
    
    private static class Variable{
        private static String s1 = "lemon";
    }
    
    public static final void func1() {
        varStaticFinal2.put("X","x") ;
    }
    
    public static class StaticClass1{
        public static final String varStaticFinal = "StaticClass1.varStaticFinal";
    }
    
    public static final class StaticClassFinal1{
        private static String varStaticFinal = "StaticClassFinal1.varStaticFinal";
        
        private final static void log() {
            System.out.println(ClassTest.varStaticFinal);
            
            String s = Variable.s1;
        }
    }
    
    public class InnerClass1{
        public final String gyum = "apple";
    }
    
    public final class InnerClassFinal1{
        
    }
}
