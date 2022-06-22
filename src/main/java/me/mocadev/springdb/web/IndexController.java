package me.mocadev.springdb.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/items";
    }
}
