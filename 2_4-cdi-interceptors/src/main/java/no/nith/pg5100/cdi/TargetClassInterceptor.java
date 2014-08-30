package no.nith.pg5100.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TargetClassInterceptor {

    public String doSomething(String s) {
        return "-> " + s;
    }

    public void doNothing() {
    }

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        System.out.println(TargetClassInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " start");
        try {
            return ic.proceed();
        } finally {
            System.out.println(TargetClassInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " exit");
        }
    }
}
