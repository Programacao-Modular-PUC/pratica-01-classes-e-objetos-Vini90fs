/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1completa;

/**
 *
 * @author 1512857
 */
public class TrianguloRetangulo {
    private double h;
    private double c1;
    private double c2;
    
    public TrianguloRetangulo(double h, double c1, double c2){
        this.h = h;
        this.c1 = c1;
        this.c2 = c2;
    }
    
    public TrianguloRetangulo(){
        this.h = 0;
        this.c1 = 0.0;
        this.c2 = 0.0;
    }

    /**
     * @return the h
     */
    public double getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * @return the c1
     */
    public double getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(double c1) {
        this.c1 = c1;
    }

    /**
     * @return the c2
     */
    public double getC2() {
        return c2;
    }

    /**
     * @param c2 the c2 to set
     */
    public void setC2(double c2) {
        this.c2 = c2;
    }
    
    public double calcularArea(){
        return (c1 * c2) / 2;
    }
    
    public double calcularHipotenusa(){
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }
}
