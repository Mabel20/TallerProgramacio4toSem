/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprog;

/**
 *
 * @author mabel
 */
public class Rectangulo {
    double ancho;
    double altura;


public Rectangulo(){
  this.altura = 1.00d;
  this.ancho = 1.00d;
}
 public Rectangulo(float ancho, float altura ){
     this.altura = altura;
     this.ancho = ancho;
 }

    public double getArea() {
          return ancho * altura;
      
    }

    public double getPerimetro() {
      return (ancho + altura) * 2;
    }
   

public static void main(String[] args) {
        // TODO code application logic here
    Rectangulo ret = new Rectangulo();
    ret.getArea();
    ret.getPerimetro();
    }
}
