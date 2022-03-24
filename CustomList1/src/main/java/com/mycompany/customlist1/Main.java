/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customlist1;

/**
 *
 * @author berti
 */
public class Main {

    public static void main(String[] args) {
        
        Element eins = new Element(1);
        Element zwei = new Element(2);
        Element drei = new Element(3);
        Element vier = new Element(4);
        
        CustomList l = new CustomList(eins);     

        l.addElement(zwei);
        l.addElement(drei);
        l.addElement(vier);
        
        System.out.println(l.countElements());
        //l.removeElement(new Element(4));
        //l.addElement(new Element(5));
        System.out.println(l.countElements());
        //System.out.println(l.getLastElement().toString());
        //System.out.println(drei.compareTo(vier));
        System.out.println(l.getElementByID(3));
        

    }
}
