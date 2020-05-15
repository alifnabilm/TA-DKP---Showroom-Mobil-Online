/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.pdkp;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String jenismobil; 
private String mesin;
private String warna;
private String transmisi;
private int harga;
public String getJenis(){
    return jenismobil;
}
public String getMesin(){
    return mesin;
}
public String getWarna(){
    return warna;
}
public String getTransmisi(){
    return transmisi;
}
public int getHarga(){
    return harga;
}
public void setJenis(String jenismobils){
    this.jenismobil=jenismobils;
    
}
public void setMesin(String mesins){
    this.mesin=mesins;
}
public void setWarna(String warnas){
    this.warna=warnas;
}
public void setTransmisi(String transmisis){
    this.transmisi=transmisis;
}
public void setHarga(int hargas){
    this.harga=hargas;
}
}
