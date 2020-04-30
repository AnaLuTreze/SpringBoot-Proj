package ana.franco.projetoum.modelo;

public class Cliente {

    private String nome;
    private long ID;
    private double telefone;
    private int idade;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cliente(long ID) {
        this.ID = ID;
    }
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public Cliente(double telefone) {
        this.telefone = telefone;
    }
    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double onetelef) {
        this.telefone = telefone;
    }
    public Cliente(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + ID +
                ", numero=" + telefone +
                ", idade=" + idade +
                '}';
    }
}

