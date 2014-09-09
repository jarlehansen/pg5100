package no.nith.pg5100;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet(name = "TextServlet", urlPatterns = "/text")
public class TextServlet extends HttpServlet {

    // To inject a predefined bean/resource
    @Resource
    private ValidatorFactory validatorFactory;

    // http://localhost:8080/3_4-bean-validation-webapp-1.0-SNAPSHOT/text
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Validator validator = validatorFactory.getValidator();
        PrintWriter writer = response.getWriter();

        MyObject test1 = new MyObject("test", 10);
        Set<ConstraintViolation<MyObject>> violations = validator.validate(test1);
        writer.write(test1 + "\nViolations: " + violations.size() + "\n\n");

        MyObject test2 = new MyObject(null, -5);
        violations = validator.validate(test2);
        writer.write(test2 + "\nViolations: " + violations.size());
    }
}
