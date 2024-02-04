/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mypact.medidormarioriedade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Pessoal
 */
public class MedidorMarioriedade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("seu nacimento");
        float nasc = teclado.nextFloat();
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        
        if(year-nasc >=18){
            System.out.println("maior de idade "+(year-nasc));
        }else{
            System.out.println("menor de idade " +(year-nasc));
        }
    }
}
