package org.zerock.jex01.security.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/doAll")
    public void doAll() {
        log.warn("doAll................................");
    }

    @GetMapping("/doMember")
    public void doMember() {
        log.warn("doMember................................");
    }

    @GetMapping("/doAdmin")
    public void doAdmin() {
        log.warn("doAdmin................................");
    }

}
