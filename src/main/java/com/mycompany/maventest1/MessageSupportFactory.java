/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maventest1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author александр
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instanse;
    private Properties props;
    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSupportFactory() {
        props = new Properties();
        try {
            // D:\Projects\Projects\MavenTest1\src\main\resources\mf.properties
            //D:\Projects\Projects\MavenTest1\src\main\java\com\mycompany\maventest1\mf.properties
            props.load(new FileInputStream("src/conf/mf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        };
    }

    static {
        instanse = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInctance(){
    return instanse;
    }
    
    public MessageRenderer getMessageRenderer(){
    return renderer; }
    
    public MessageProvider getMessageProvider(){
    return provider; }
      
}
