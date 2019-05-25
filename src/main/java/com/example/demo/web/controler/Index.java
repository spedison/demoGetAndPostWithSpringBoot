package com.example.demo.web.controler;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Calendar;

@Data
class DTOForm {
    private String nome;
    private LocalDate data;
}

@Controller
@Log4j2
@RequestMapping("/teste")
public class Index {

    @GetMapping("/index")
    public ModelAndView getForm(){
        return new ModelAndView("index");
    }

    @PostMapping("/index")
    public ModelAndView postForm(@ModelAttribute DTOForm frmMain){
        ModelAndView ret = new ModelAndView("nome");
        ret.addObject("registro", frmMain);
        log.debug("Localizado :: " + frmMain);
        return ret;
    }

}

