package com.sharedguide.guide.controller;

import com.sharedguide.guide.model.About;
import com.sharedguide.guide.sercice.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 18710
 */

@Controller
@RequestMapping(value = "/about")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    @GetMapping(name = "/findAll")
    public About findAll(int id){
        return aboutService.findByid(id);
    }

}
