/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Santiago Vela
 */
public class Resultados {

    public static void main(String[] args) {
        
        Exam miExamen = new Exam("developper", "desarrollo de aplicaciones", "base de datos", 20, "Sr");
        System.out.println(miExamen.sueldo());
        System.out.println("");
        System.out.println(miExamen.toString());
    }
    
}
