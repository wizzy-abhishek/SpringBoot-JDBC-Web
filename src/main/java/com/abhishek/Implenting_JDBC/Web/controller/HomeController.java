package com.abhishek.Implenting_JDBC.Web.controller;

import com.abhishek.Implenting_JDBC.Web.pojo.Alien;
import com.abhishek.Implenting_JDBC.Web.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private AlienService alienService ;

    public AlienService getAlienService() {
        return alienService;
    }
    @Autowired
    public void setAlienService(AlienService alienService) {
        this.alienService = alienService;
    }

    @RequestMapping("/")
    public ModelAndView home(ModelAndView mv){
      mv.setViewName("home");
      return mv ;
    }

    @RequestMapping("/creating")
    public String show(Alien alien){
        int isAdded = alienService.add(alien);
        if(isAdded == 1){
            return "main" ;
        }
        return "error" ;
    }

}
