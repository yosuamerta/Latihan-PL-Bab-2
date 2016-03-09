
package lomba;


public class Hitung {
    private int panjang, lebar, menit;
    private double nilai;
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
  public void setMenit( int menit){
      this.menit=menit;
  }
 public double nilai(){
 return (double)lebar+lebar+panjang+panjang/menit;}
}
