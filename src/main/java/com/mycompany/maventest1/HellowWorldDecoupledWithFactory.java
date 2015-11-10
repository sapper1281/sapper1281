package com.mycompany.maventest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author александр
 */
public class HellowWorldDecoupledWithFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MessageRenderer mr=MessageSupportFactory.getInctance().getMessageRenderer();
      MessageProvider mp=MessageSupportFactory.getInctance().getMessageProvider();
      mr.setMessageProvider(mp);
      mr.render();
       
    }
    
}
