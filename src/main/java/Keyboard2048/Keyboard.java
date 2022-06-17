/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keyboard2048;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Trung.
 */
public class Keyboard implements KeyListener{
    
    public static boolean[] keys = new boolean[120];
    public static boolean[] lastKeys = new boolean[120];
    
    public void update(){
        for(int i = 0; i < keys.length; i++){
            lastKeys[i] = keys[i];
        }
    }
    
    public static boolean key(int key){
        return keys[key];
    }
    
    public static boolean keyDown(int key){
        return keys[key] && !lastKeys[key];
    }
    
    public static boolean keyUp(int key){
        return !keys[key] && lastKeys[key];
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
   }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
   }
}
