/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author avbravo
 */
public class Token {
    public String kind;
    public String value;

    @Override
    public String toString() {
        return kind + " \"" + value + "\"";
}
  
}