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
public class FacadePatternDemo {
    public static void main(String[] args) {
      BidangMaker bidangMaker = new BidangMaker();

      bidangMaker.gambarBintang();
      bidangMaker.gambarJajarGenjang();
      bidangMaker.gambarSegiEnam();
      bidangMaker.gambarSegiTiga();	
   }
}
