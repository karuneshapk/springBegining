package pojosAOP;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.omg.CORBA.Object;

/**
 * Created by user on 07.05.2016.
 */

public class NotifierAround implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before of the method by around type");
        methodInvocation.proceed();
        System.out.println("After of the method by around");
        return null;
    }
}

