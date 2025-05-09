package model;

import util.Queue;

public class Siparis {
   private String Sehir;
   //private String Adres;
   private Queue<Urunler> musteriListesi;//musteri siparislerini tutmak icin

    public Siparis() {

    }
    //sehir getter setter
    public String getSehir() {
        return Sehir;
    }
    public void setSehir(String sehir) {
        this.Sehir = sehir;
    }


    /*
    //Adres getter setter
    public String getAdres(){return Adres;}
    public void setAdres(String adres){this.Adres=adres; }
    */


    //musteriListesi getter setter
    public Queue<Urunler> getMusteriListesi() {
        return musteriListesi;
    }
    public void setMusteriListesi(Queue<Urunler> musteriListesi) {
        this.musteriListesi = musteriListesi;
    }

    @Override
    public String toString(){
        return getSehir();
    }
}
