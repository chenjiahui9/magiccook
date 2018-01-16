package com.shang9.magiccook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PageController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/{page}",method = RequestMethod.GET)
    public String indexPage(@PathVariable("page") String page){
        return page;
    }


}
