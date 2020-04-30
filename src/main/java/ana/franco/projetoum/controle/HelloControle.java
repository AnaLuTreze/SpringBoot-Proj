package ana.franco.projetoum.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControle{

 @GetMapping("/")
    public String index(){
     return "Olá, seja bem vindo(a) ";

 }


}