/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author leo
 */
public class ConsumerT {
     public static void main (String [] args){
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.forEach(n -> { {
                if( n % 2 == 0){
                    System.out.println(n);
                }
            }
        });
        
    }
    
}
