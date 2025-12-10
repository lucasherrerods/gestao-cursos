public class Pessoa {
    String nome;
    String email;

    public Pessoa() {
        this.nome = "Fulano";
        this.email = "fulano@email.com";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}