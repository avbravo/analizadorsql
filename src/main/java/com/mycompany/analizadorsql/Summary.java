/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

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
    Integer notCount;
    Integer andCount;
    Integer orCount;
    Integer count;

    public Summary() {
    }

    public Summary(Integer open, Integer close, Integer notCount, Integer andCount, Integer orCount, Integer count) {
        this.open = open;
        this.close = close;
        this.notCount = notCount;
        this.andCount = andCount;
        this.orCount = orCount;
        this.count = count;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getClose() {
        return close;
    }

    public void setClose(Integer close) {
        this.close = close;
    }

    public Integer getNotCount() {
        return notCount;
    }

    public void setNotCount(Integer notCount) {
        this.notCount = notCount;
    }

    public Integer getAndCount() {
        return andCount;
    }

    public void setAndCount(Integer andCount) {
        this.andCount = andCount;
    }

    public Integer getOrCount() {
        return orCount;
    }

    public void setOrCount(Integer orCount) {
        this.orCount = orCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
