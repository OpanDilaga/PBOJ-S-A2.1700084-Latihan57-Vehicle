/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan57;

/**
 *
 * @author acer
 * Nama     : Opan Dilaga
 * NIM      : A2.1700084
 * Kelas    : TI IV E J&S
 */
//class
public class Bicycle extends Vehicle  {
    private int myGearCount;
    
    public Bicycle(){
        myGearCount = 12;
    }
    
//atribut
    public int getGearCount(){
        return myGearCount;
    }  
   public void setGearCount(int gearCount){
       this.myGearCount = gearCount;
   }
}