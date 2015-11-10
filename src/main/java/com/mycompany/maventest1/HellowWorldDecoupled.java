/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maventest1;

/**
 *
 * @author александр
 */
public class HellowWorldDecoupled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageProvider mp=new HelloWorldMessageProvider();
        MessageRenderer mr= new StandardOutMessageRenderer();
        mr.setMessageProvider(mp);
        mr.render();
    }
    
}
