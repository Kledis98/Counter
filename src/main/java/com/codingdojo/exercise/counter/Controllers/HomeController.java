package com.codingdojo.exercise.counter.Controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")

    public String index(Http

                                    Session session) {

        Integer count =0;
        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
            session.setAttribute("count", 0);

        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
           count = (Integer) session.getAttribute("count");
           count++;
           session.setAttribute("count",count);
        }
        return "index";
    }

    @RequestMapping("/counter")
    public String counter(){
        return "counter";
    }


}
