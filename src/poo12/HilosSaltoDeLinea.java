/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo12;

/**
 *
 * @author poo08alu26
 */
public class HilosSaltoDeLinea implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.print("  ");
        }
    }
    
}
