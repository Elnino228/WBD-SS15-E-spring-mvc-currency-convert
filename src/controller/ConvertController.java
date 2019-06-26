package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConvertController {
    @GetMapping("/index")
    public String qqq() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(int rate,int usd, Model model) {
        int vnd=rate*usd;
        model.addAttribute("vnd",vnd);
        return "result";
    }
}

//@Controller
//class Convert {
//    @PostMapping("/convert")
//    public String convert(int rate,int usd, Model model) {
//        int vnd=rate*usd;
//        model.addAttribute("vnd",vnd);
//        return "result";
//    }
//}
