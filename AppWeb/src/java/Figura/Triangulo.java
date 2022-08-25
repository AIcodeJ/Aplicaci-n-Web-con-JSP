/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * Autor: Alexis Pérez
 * Matrícula: 2942889
 * 
 */
public class Triangulo {
    
    private double Base;
    private double Height;
    private double Result;

    public Triangulo(String B, String H) {
        this.setBase(Double.parseDouble(B));
        this.setHeight(Double.parseDouble(H));
    }
    
    public void Area(){
        double a = (this.getBase() * this.getHeight()) / 2;
        this.setResult(a);
    }
    
    public void Perimeter(){
        double p = this.getBase() * 3;
        this.setResult(p);
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    public double getResult() {
        return Result;
    }

    public void setResult(double Result) {
        this.Result = Result;
    }
}
