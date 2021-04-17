package app.domain;

public class Professor extends Pessoa{
    private Boolean corona;

    public Professor(Boolean corona) {
        this.corona = corona;
    }

    public Professor(Long id, String nome, String sexo, Double altura, boolean corona) {
        super(id, nome, sexo, altura);
        this.corona = corona;
    }

    @Override
    public String irParaEscola(Boolean corona) {
        if (corona != null) {
          if(corona) {
              return "Acesso negado professor!";

          }else {
              return "Acesso concedido professor";
          }
        }
        return "error professor";
    }
}
