package demomybatis.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
// @CrossOrigin(origins = "*")
public class DemomybatisController {

    @GetMapping(path = "/test")
    public String test() {
        return "Controller Available.\n";
    }
    
}
