/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customlist1;

/**
 *
 * @author berti
 */
public class CustomList {

    private Element start;

    public CustomList(int eg) {
        start = new Element(eg);
    }

    public CustomList(Element eg) {
        start = eg;
    }

    public Element getLastElement() {
        Element e = start;
        while (e.getNext() != null) {
            e = e.getNext();
        }
        return e;
    }

    public void addElement(Element e) {
        getLastElement().setNext(e);
    }

    public void removeElement(Element e) {
        Element check = start;
        if (e.getWert() != start.getWert()) {
            while (check.getNext() != null) {
                if (e.getWert() == check.getNext().getWert()) {
                    check.setNext(check.getNext().getNext());
                    break;
                }
                check = check.getNext();
            }
        } else {
            start = start.getNext();
        }
    }

    public int countElements() {
        int count = 1;
        Element e = start;
        if (start.getNext() == null) {
            return 1;
        }
        while (e.getNext() != null) {
            count++;
            e = e.getNext();
        }
        return count;
    }

    public boolean containsElement(Element e) {

        return false;

    }

    public Element getElementByID(int i) {
        Element e = start;
        while (e != null && i > 0) {
            e = e.getNext();
            i--;
        }
        if (e == null) {
            // Fehler: index out of bounds
            return null;
        }
        return e;
    }
    
    public int getWertByID(int i) {
        Element e = start;
        while (e != null && i > 0) {
            e = e.getNext();
            i--;
        }
        if (e == null) {
            // Fehler: index out of bounds
            return 0;
        }
        return e.getWert();
    }
}
