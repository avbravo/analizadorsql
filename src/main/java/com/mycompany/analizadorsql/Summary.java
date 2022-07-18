/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class Summary {

    private Integer open;
    private Integer close;
    private Integer equalsSimbol;
    private Integer arrobaSimbol;
    private Integer between;
    private Integer comillaSimbol;
    private Integer notCount;
    private Integer andCount;
    private Integer orCount;
    private List<String> tokens = new ArrayList<>();
    private List<String> fields = new ArrayList<>() ;
    private List<String> parameters = new ArrayList<>();

    public Summary() {
    }

    public Summary(Integer open, Integer close, Integer equalsSimbol, Integer arrobaSimbol, Integer between, Integer comillaSimbol, Integer notCount, Integer andCount, Integer orCount) {
        this.open = open;
        this.close = close;
        this.equalsSimbol = equalsSimbol;
        this.arrobaSimbol = arrobaSimbol;
        this.between = between;
        this.comillaSimbol = comillaSimbol;
        this.notCount = notCount;
        this.andCount = andCount;
        this.orCount = orCount;
    }

    public Summary(Integer open, Integer close, Integer equalsSimbol, Integer arrobaSimbol, Integer between, Integer comillaSimbol, Integer notCount, Integer andCount, Integer orCount, List<String> fields, List<String> parameters) {
        this.open = open;
        this.close = close;
        this.equalsSimbol = equalsSimbol;
        this.arrobaSimbol = arrobaSimbol;
        this.between = between;
        this.comillaSimbol = comillaSimbol;
        this.notCount = notCount;
        this.andCount = andCount;
        this.orCount = orCount;
        this.fields = fields;
        this.parameters = parameters;
    }

    
    
    @Override
    public String toString() {
        return "Summary{" + "open=" + open + ", close=" + close + ", equalsSimbol=" + equalsSimbol + ", arrobaSimbol=" + arrobaSimbol + ", between=" + between + ", comillaSimbol=" + comillaSimbol + ", notCount=" + notCount + ", andCount=" + andCount + ", orCount=" + orCount + '}';
    }
    
    

}
