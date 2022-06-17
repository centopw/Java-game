/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main2048.Game;

/**
 *
 * @author Thien
 */
import java.awt.event.KeyEvent;
import Keyboard2048.Keyboard;
import graphics.Renderer;
import graphics.Sprite;

import java.awt.Graphics2D;
import main.Main;
public class Game {
    public Game() {
        init();
    }
    
    public void init() {
        
    }
    
    public void update() {
        if(Keyboard.keyDown(KeyEvent.VK_A)) {
            System.out.println("Down a");
        }
        if(Keyboard.keyDown(KeyEvent.VK_A)) {
            System.out.println("a");
        }
        if(Keyboard.keyDown(KeyEvent.VK_A)) {
            System.out.println("Up a");
        }
        
        
    }
    
    public void render() {
        Renderer.renderBackground();
        
        Renderer.renderSprite(new Sprite(100,100,0xffffff00), 100, 100);
        
        for(int i=0;i<Main.pixels.length;i++) {
            Main.pixels[i] = Renderer.pixels[i];
        }
    }
    
    public void renderText(Graphics2D g) {
        
    }
}
