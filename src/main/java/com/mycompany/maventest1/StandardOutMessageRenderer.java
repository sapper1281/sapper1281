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
public class StandardOutMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider==null){
        throw new RuntimeException("Not supported yet."+StandardOutMessageRenderer.class.getName()); //To change body of generated methods, choose Tools | Templates.
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider=provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
    
    
    
}
