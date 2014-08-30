package no.nith.pg5100.cdi;

import javax.interceptor.Interceptors;

public class ClassInterceptorImpl {
    @Interceptors(ClassInterceptor.class)
    public String doSomething(String s) {
        return "-> " + s;
    }

    @Interceptors(ClassInterceptor.class)
    public void doNothing() {
    }
}
