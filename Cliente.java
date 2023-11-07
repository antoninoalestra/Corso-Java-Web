public class Cliente {
    private static int idProgressivo = 1;
    private int id;
    private String nome;
    private String email;

    public Cliente(String nome, String email){
        this.id = idProgressivo;
        this.nome = nome;
        this.email = email;
        idProgressivo++;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Cliente numero: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email;
    }
}
