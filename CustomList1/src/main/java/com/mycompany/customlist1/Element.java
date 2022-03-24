/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customlist1;

/**
 *
 * @author berti
 */
public class Element{

    private int wert;
    Element next;

    public Element(int eg) {
        this.wert = eg;
        this.next = null;
    }

    public Element(int eg, Element next) {
        this.wert = eg;
        this.next = next;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" + "wert=" + wert + ", next=" + next + '}';
    }
}
