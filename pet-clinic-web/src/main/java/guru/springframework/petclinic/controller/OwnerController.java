package guru.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/index.htm","/index"})
    public String listOwners(){
        return "owners/index";
    }
}
