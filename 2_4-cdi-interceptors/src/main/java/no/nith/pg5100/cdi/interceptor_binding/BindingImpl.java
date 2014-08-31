package no.nith.pg5100.cdi.interceptor_binding;

@CustomBinding
public class BindingImpl {

    public String doSomething(String s) {
        return "-> " + s;
    }
}
