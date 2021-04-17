package app;

import app.domain.Pessoa;
import app.service.PessoaService;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa = PessoaService.retornaPessoa(1L);

        if(pessoa != null){
            System.out.println("A pessoa é o "+pessoa.getNome()+" e é "+pessoa.getSexo());
            System.out.println( pessoa.irParaEscola(true));
        }else{
            System.out.println("Usuário inexistente");
        }
    }
}
