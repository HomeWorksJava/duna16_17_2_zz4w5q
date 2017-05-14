/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Nagy2
 */
@XmlRootElement(name="szemely")
@XmlType(propOrder={"id","nev","kor"})
public class Szemely {
    private int id;
    private String nev;
    private int kor;
    
@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
@XmlElement
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

 @XmlElement
    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    
}
