package com.marcelo.marcelao.justATest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class justATest {
    int idade = 10;
    String nome = "andre";
    /*

    public justATest(int i,String n){
        this.idade = 10;
        this.nome = "Macelo";
    }
     */
    @GetMapping("/user")
    public String getValues(){
        return "idade ="+Integer.toString(this.idade)+"/ nome = "+this.nome;

        }
        @RequestMapping("/")
        @GetMapping
        public String hi()
        {
            return "hi";
        }
    }

