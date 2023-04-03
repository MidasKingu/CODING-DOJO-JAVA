package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CounterController {
    @GetMapping("/")
    public String indexPage(HttpSession session) {
        if(session.getAttribute("counter") == null) {
            session.setAttribute("counter", 0);
        }
        else {
            Integer count = (Integer) session.getAttribute("counter");
            session.setAttribute("counter", count + 1);
        }

        return "index.jsp";
    }
    @GetMapping("/counter")
    public String counterPage(HttpSession session) {


        return "counter.jsp";
    }
}

