package projetojedi.poo;

public class Competidor {
    private String nome;
    private int idade;
    private char sexo;
    private String cpf;
    private double peso;
    private String categoria;
    private String nivelCategoria;

    public Competidor() {

    }

    public Competidor(String nome, int idade, char sexo, String cpf, double peso, String categoria, String nivelCategoria) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setCpf(cpf);
        setPeso(peso);
        setCategoria(categoria);
        setNivelCategoria(nivelCategoria);
    }

    public void dados() {
        System.out.printf("Nome: %s   Idade: %d   Sexo: %s   CPF: %s   Peso: %.2f   Categoria: %s   (%s)", this.nome,
                this.idade, this.sexo, this.cpf, this.peso, this.categoria, this.nivelCategoria);
    }

    public String getNivelCategoria() {
        return nivelCategoria;
    }

    public void setNivelCategoria(String nivelCategoria) {
        this.nivelCategoria = nivelCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


