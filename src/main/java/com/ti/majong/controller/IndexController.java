package com.ti.majong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The type Hello controller.
 *
 * @author TiHongsheng
 */
@Controller
public class IndexController {


    /**
     * Index string.
     *
     * @return the string
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
