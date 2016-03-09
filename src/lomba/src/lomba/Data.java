/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lomba;


public class Data {
      private int panjang, lebar,putaran,menit;
      private double nilai;
      String nim, nama;
  public void setPanjang(int panjang){
      this.panjang=panjang;
  }
  public int getPanjang(){
  return panjang;}
  public void setLebar(int lebar){
  this.lebar=lebar;
  }
  public int getLebar(){
  return lebar;
  }
  public Data(String nim,String nama,int putaran,int menit,double nilai){
      this.nim=nim;
      this.nama=nama;
      this.putaran=putaran;
      this.menit=menit;
      
      
  }
  public void print(){
      System.out.println(nim+" "+nama+" "+nilai);
  }
  public void setJuara(double nilai){

  this.nilai=nilai;
      
  }
  public void getJuara(){
      System.out.println(nama+" "+nilai+" waktu tercepat");
  }
          
  }

