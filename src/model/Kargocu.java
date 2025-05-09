package model;

import util.Queue;

public class Kargocu {
    private Queue<Siparis> SiparisListesi;


    //Siparis listesi getter setter
    public Queue getSiparisListesi(){return SiparisListesi;}
    public void setSiparisListesi(Queue siparisListesi){SiparisListesi=siparisListesi;}

public void kargoTeslim(){
    //buton icin ozellestirilecek.
    System.out.println("Kargolar teslim edildi.");
}


}
