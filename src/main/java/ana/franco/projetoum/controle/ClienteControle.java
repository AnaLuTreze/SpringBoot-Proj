package ana.franco.projetoum.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ana.franco.projetoum.modelo.Cliente;


@RestController
public class ClienteControle {


    @GetMapping("/cliente")
    public Cliente getCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Silva");
        cliente.setID(001);
        cliente.setIdade(29);
        cliente.setTelefone(99656567);
        return cliente;
    }
}
