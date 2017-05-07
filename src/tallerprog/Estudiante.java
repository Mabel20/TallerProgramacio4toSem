/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprog;

import java.util.Scanner;

/**
 *
 * @author mabel
 */
public class Estudiante extends Persona {
    Scanner Leer = new Scanner(System.in);
    String Status;
    
     public Estudiante() {
        this.Status= "";
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = Status;
    }
    
    void Status(){
        System.out.println("iNgReSe El CuRsO De EsTudIaNtE: ");
        Status = Leer.next();
    }
    
}
    

