package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {
    @GetMapping
    public String home(HttpServletRequest request){
        Locale locale = request.getLocale();
        return "home";
    }
}
