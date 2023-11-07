import java.util.ArrayList;

class Inventario{
    private ArrayList<Giocattolo> giocattoli;

    public Inventario(){
        giocattoli = new ArrayList<Giocattolo>();
    }

    public void addGiocattolo(Giocattolo giocattolo){
        giocattoli.add(giocattolo);
    }

    public void removeGiocattolo(Giocattolo giocattolo){
        giocattoli.remove(giocattolo);
    }

    public void modificaGiocattolo(Giocattolo giocattolo){
        for(Giocattolo g : giocattoli){
            if(g.getId() == giocattolo.getId()){
                g.setNome(giocattolo.getNome());
                g.setPrezzo(giocattolo.getPrezzo());
                g.setEtaConsigliata(giocattolo.getEtaConsigliata());
            }
        }
    }

    public void stampaInventario(){
        for(Giocattolo g : giocattoli){
            System.out.println(g);
            System.out.println();
        }
    }

    public Giocattolo getGiocattolo(int id){
        for(Giocattolo g : giocattoli){
            if(g.getId() == id){
                return g;
            }
        }
        return null;
    }
}