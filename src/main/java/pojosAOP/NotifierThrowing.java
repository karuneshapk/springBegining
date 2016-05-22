package pojosAOP;


import org.springframework.aop.ThrowsAdvice;

/**
 * Created by user on 07.05.2016.
 */

public class NotifierThrowing implements ThrowsAdvice {

    public void afterThrowing(Exception e) {
        System.out.println("after trowing");

    }
}

