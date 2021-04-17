package app.domain;

public abstract class Pessoa {
    private Long id;
    private String nome;
    private String sexo;
    private Double altura;

    public Pessoa(){

    }

    public Pessoa(Long id, String nome, String sexo, Double altura) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public abstract String irParaEscola(Boolean bol);
}
