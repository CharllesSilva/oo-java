package app.service;

import app.domain.Aluno;
import app.domain.Pessoa;
import app.domain.Professor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PessoaService {

   public static Pessoa retornaPessoa(Long id){
       Pessoa p1 = new Professor(1L, "Lucas", "MACHO", 1.98, true);
       Pessoa p2 = new Professor(2L, "XARLE", "FEMEA", 1.10, false);
       Pessoa a1 = new Aluno(3L, "Amable", "MACHO", 1.00, true);
       Pessoa a2 = new Aluno(4L, "Juia", "FEMEA", 1.70, false);

       List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(p1, p2, a1, a2));

       for(Pessoa pessoa : pessoas){
           if(id.equals(pessoa.getId())){
               return pessoa;
           }
       }
       return null;
   }
}
