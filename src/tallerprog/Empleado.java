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
public class Empleado extends Persona{
    float salario;
    Date FechaEntrada;

    public Empleado(){
        this.salario = salario;
        this.FechaEntrada = FechaEntrada;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    
    


}