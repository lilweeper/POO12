/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo12;

/**
 *
 * @author poo08alu26
 */
public class HiloR implements Runnable{
    @Override
    public void run(){
         for(int i=0;i<10;i++){
            System.out.println("iteracion "+i+ " de " +Thread.currentThread().getName());
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
}
