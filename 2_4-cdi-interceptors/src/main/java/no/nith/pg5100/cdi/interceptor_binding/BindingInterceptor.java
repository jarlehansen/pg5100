package no.nith.pg5100.cdi.interceptor_binding;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@CustomBinding
public class BindingInterceptor {

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        System.out.println(BindingInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " start");
        try {
            return ic.proceed();
        } finally {
            System.out.println(BindingInterceptor.class.getSimpleName() + " - " + ic.getMethod().getName() + " exit");
        }
    }
}
