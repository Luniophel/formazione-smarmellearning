package animale;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public abstract class Animale {

    private String nome;
    private String ciboPreferito;
    private int eta;
    private LocalDate dataIngresso;
    private double peso;
    private double altezza;

    //GETTER & SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }
    public void setCiboPreferito(String ciboPreferito) {
        this.ciboPreferito = ciboPreferito;
    }

    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }
    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //METODI
    public Animale trovaPiuAlto (List<Animale> listaAnimali){

        Animale animalePiuAlto = listaAnimali.get(1);
        Iterator<Animale> iter = listaAnimali.iterator();
        while(iter.hasNext())
        {
            Animale curAnimale = iter.next();
            curAnimale.getAltezza();

            if (curAnimale.getAltezza()>animalePiuAlto.getAltezza()){
                animalePiuAlto = curAnimale;
            }
        }
        return animalePiuAlto;
    }

    public Animale trovaPiuBasso (List<Animale> listaAnimali){

        Animale animalePiuBasso = listaAnimali.get(0);
        Iterator<Animale> iter = listaAnimali.iterator();
        while(iter.hasNext())
        {
            Animale curAnimale = iter.next();
            curAnimale.getAltezza();

            if (curAnimale.getAltezza()<animalePiuBasso.getAltezza()){
                animalePiuBasso = curAnimale;
            }
        }
        return animalePiuBasso;
    }

}