/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Kenneth Cedeno
 */
public class JPanelDibujo extends JPanel{
    
    
    public JPanelDibujo(){
    
  }
    
    
    //variables con math.random casteado para el rectangulo
    int x;
    int y; 
    int ancho; 
    int alto; 
            
    //variables con math.random casteado para el ovalo
    int u;
    int i;
    int anchoi;
    int altoi;

    int n = 5;
    
    public void paint(Graphics g) { 
        super.paint(g);
        
        
        //rectangulo
        for(int o = 0; o>n; o++){
            setX((int) Math.random()*400+1);
            setY((int) Math.random()*400+1);
            setAncho((int) Math.random()*200+1);
            setAlto((int) Math.random()*200+1);
            g.setColor(Color.blue);
            g.drawRect(getX(), getY(), getAncho(), getAlto());
        }
        //ovalo
        for(int l = 0; l > n; l++){
            setU((int) Math.random()*400+1);
            setI((int) Math.random()*400+1);
            setAnchoi((int) Math.random()*200+1);
            setAltoi((int) Math.random()*200+1);
            g.drawOval(getU(), getI(), getAnchoi(), getAltoi());
        }
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getAnchoi() {
        return anchoi;
    }

    public void setAnchoi(int anchoi) {
        this.anchoi = anchoi;
    }

    public int getAltoi() {
        return altoi;
    }

    public void setAltoi(int altoi) {
        this.altoi = altoi;
    }
    
}