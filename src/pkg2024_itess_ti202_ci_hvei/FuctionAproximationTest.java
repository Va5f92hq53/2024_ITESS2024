/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_itess_ti202_ci_hvei;

/**
 *ITESS-TICS
 * Enero-Junio 2024
 * Calculo Integral
 * TI202 FJMP
 * 12 Febrero 2024
 * Aproximacion de areas usando sumas, prueba
 * ti23110049@itess.edu.mx
 */
public class FuctionAproximationTest {
    public static void main(String[] args) {
        FuctionAproximation fa= new FuctionAproximation(0.0, 4.0, 4);
        
        fa.compute();
        System.out.println("area: " + fa.getArea());
    }
}
