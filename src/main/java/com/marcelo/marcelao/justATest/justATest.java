//depois eu irei mexe com isso, tenho q configurar o git/github para esse projeto, e depois praticar

package com.marcelo.marcelao.justATest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class justATest {
    @GetMapping("/")
    public String hello()
    {
        return "index";
    }
    @GetMapping("/number")
    public int number(){
        return 10;
    }
}
