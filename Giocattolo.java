class Giocattolo{
    private static int idProgressivo = 1;
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(String nome, double prezzo, int etaConsigliata){
        this.id = idProgressivo;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        idProgressivo++;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public void setEtaConsigliata(int etaConsigliata){
        this.etaConsigliata = etaConsigliata;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public int getEtaConsigliata(){
        return etaConsigliata;
    }

    @Override
    public String toString(){
        return "Giocattolo numero: " + this.id + "\nNome: " + this.nome 
        + "\nPrezzo: " + this.prezzo + "\nEtà consigliata: " + this.etaConsigliata;
    }
}