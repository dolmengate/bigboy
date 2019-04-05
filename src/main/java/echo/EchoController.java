package echo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping("/")
    public String echo(@RequestParam(value="msg", defaultValue="default val") String msg) {
        return msg + " " + msg + " " + msg;
    }
}
