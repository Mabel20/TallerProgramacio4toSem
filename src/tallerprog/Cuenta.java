/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprog;

import java.util.Date;

/**
 *
 * @author mabel
 */
public class Cuenta {
      private int id;
    private double saldo;
    private double InteresAnual;
    private Date fecha;

    public Cuenta() {
        this.id = id;
        this.saldo = 0;
        this.InteresAnual = 0;

    }
  public Cuenta(int id, double saldo) {
        this.id = 12;
        this.saldo = 120;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return InteresAnual;
    }

    public void setInteresAnual(double InteresAnual) {
        this.InteresAnual= InteresAnual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
  
    public double getInteresMensual(){
        return saldo / 12;
    }
    public double retiro(double retiro){
        return saldo = saldo - retiro;
    }
     public double deposito(double deposito){
         return saldo = saldo + deposito;
     }
     
     public static void main(String[] args) {
        // TODO code application logic here
           Cuenta cta = new Cuenta();
        cta.getInteresAnual();
        cta.retiro(20);
        cta.deposito(40);
        cta.getInteresMensual();
    }
    
}
