package desarrollo_idat.app_demospring.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
    @GetMapping("/Inicio")
    public String home(){
        return "home";
    }
}
