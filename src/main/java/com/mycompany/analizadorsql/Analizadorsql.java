/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.analizadorsql;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class Analizadorsql {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SQLAnalizer sQLAnalizer = new SQLAnalizer();
        
        String one="idoceano = @idocenao";
        List<String> list = Arrays.asList("idoceano = @idoceano",
                "idoceano = @idoceano and oceano = @oceano",
                "idoceano = @idoceano and oceano = 'pacifico'",
                "idoceano @idoceano",
                "oceano = @oceano)"
        );
        
        for(String s: list){
            System.out.println("===========================================================================");
            System.out.println("Analizando "+ s );
            
            List<String> tokenResult =sQLAnalizer.getTokensWithCollection(s, " ");
            for (String tokens: tokenResult){
                System.out.println("Token "+tokens);
            }
            Summary summary = sQLAnalizer.count(s, tokenResult);
            System.out.println("[------------------ Summary ---------------------------- ]");
            System.out.println(""+summary.toString());
            
            System.out.println("_____________________________________________________________________");
        }
        
    }
}
