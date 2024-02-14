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
public class FuctionAproximation {
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public FuctionAproximation(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        
        this.x=new double [n+1];
        this.fx=new double [n+1];
    }

   
   
         public void compute ()  {
           dx = (xEnd - xIni)/n;
           area=0.0;
           for ( int i = 0; i<=n; i++){
               x[i]=xIni + i*dx;
               fx[i] = x[i] * x[i];
               area = area + fx[i] * dx;
            
           }
         } 
         
         public double getArea(){
             return area;
         }
                }
            

