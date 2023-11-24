/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo12;

/**
 *
 * @author gaelc
 */
public class HiloNumeros implements Runnable {

    private String tipo; // "Pares" o "Impares"
    private int inicio;
    private int fin;
    private int incremento;

    public HiloNumeros(String tipo, int inicio, int fin, int incremento) {
        this.tipo = tipo;
        this.inicio = inicio;
        this.fin = fin;
        this.incremento = incremento;
    }

    @Override
    public void run() {
        System.out.println("Inicia el hilo " + tipo);

        for (int i = inicio; i <= fin; i += incremento) {
            System.out.println(tipo + ": " + i);
        }

        System.out.println("Termina el hilo " + tipo);
    }
}

