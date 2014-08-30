package no.nith.pg5100.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ClassInterceptor {
    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        System.out.println(ClassInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " start");
        try {
            return ic.proceed();
        } finally {
            System.out.println(ClassInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " exit");
        }
    }
}
