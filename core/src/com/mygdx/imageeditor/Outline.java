package com.mygdx.imageeditor;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Outline {
    public Texture OutlineTex;
    
    public Outline(Vector2 recSize, Color color, int thicc) {
        Pixmap map = new Pixmap((int) recSize.x, (int) recSize.y, Format.RGBA8888);
        map.setColor(color);
        
        //Top
        for (int x = 0; x < map.getWidth(); x++) {
            for (int y = 0; y < thicc; y++) {
                map.drawPixel(x, y);
            }
        }
        
        //Bottom
        for (int x = 0; x < map.getWidth(); x++) {
            for (int y = map.getHeight(); y < map.getHeight(); y++) {
                map.drawPixel(x, y);
            }
        }
        
        //Left
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < thicc; x++) {
                map.drawPixel(x, y);
            }
        }
        
        //Right
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = map.getWidth() - thicc; x < map.getWidth(); x++) {
                map.drawPixel(x, y);
            }
        }
        
        OutlineTex = new Texture(map);
    }

}
