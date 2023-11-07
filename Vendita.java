public class Vendita {
    private static int idProgressivo = 1;
    private int idScontrino;
    private int idGiocattolo;
    private int idCliente;

    public Vendita(int idGiocattolo, int idCliente){
        this.idScontrino = idProgressivo;
        this.idGiocattolo = idGiocattolo;
        this.idCliente = idCliente;
        idProgressivo++;
    }

    public int getIdScontrino(){
        return this.idScontrino;
    }

    public int getIdGiocattolo(){
        return this.idGiocattolo;
    }

    public int getIdCliente(){
        return this.idCliente;
    }

    @Override
    public String toString(){
        return "Scontrino numero: " + this.idScontrino +
        "\nId prodotto acquistato: " + this.idGiocattolo + "\nId Cliente: " + this.idCliente;
    }
}
