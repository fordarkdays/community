package top.qijunyi.community0010.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:first springboot web
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    //model读url内的getting
    public String index(){
        //返回字符串在template找html
        return "index";
    }
}
