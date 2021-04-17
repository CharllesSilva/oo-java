package app.domain;

public class Aluno extends Pessoa {
    private Boolean uniformizado;

    public Aluno(Long id, String nome, String sexo, Double altura, boolean uniformizado) {
        super(id, nome, sexo, altura);
        this.uniformizado = uniformizado;
    }

    public boolean isUniformizado() {
        return uniformizado;
    }

    public void setUniformizado(boolean uniformizado) {
        this.uniformizado = uniformizado;
    }

    @Override
    public String irParaEscola(Boolean unifomizado) {
        if (unifomizado != null) {
            if(!unifomizado) {
                return "Acesso negado aluno!";
            }else {
                return "Acesso concedido aluno";
            }
        }
        return "error aluno";
    }
}
