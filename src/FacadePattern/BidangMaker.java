/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

/**
 *
 * @author mibadguthwara
 */
public class BidangMaker {
   private Bidang bintang;
   private Bidang jajargenjang;
   private Bidang segienam;
   private Bidang segitiga;

   public BidangMaker() {
      bintang = new Bintang();
      jajargenjang = new JajarGenjang();
      segienam = new SegiEnam();
      segitiga = new SegiTiga();
   }

   public void gambarBintang(){
      bintang.gambar();
   }
   public void gambarJajarGenjang(){
      jajargenjang.gambar();
   }
   public void gambarSegiEnam(){
      segienam.gambar();
   }
   public void gambarSegiTiga(){
      segitiga.gambar();
   }
}
