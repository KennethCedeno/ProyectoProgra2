/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

/**
 *
 * @author Kenneth Cedeno
 */
public class Examenes {
     Estudiante pepe;
    int nota;
    int totalDePuntos;
    int puntosObtenidos;

    public void Examen() {
    }

    public Examenes(Estudiante pepe, int totalDePuntos, int puntosObtenidos, int nota) {
        this.pepe = pepe;
        this.totalDePuntos = totalDePuntos;
        this.puntosObtenidos = puntosObtenidos;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Examenes{" + "pepe=" + pepe + ", nota=" + nota + ", totalDePuntos=" + totalDePuntos + ", puntosObtenidos=" + puntosObtenidos + '}';
    }

    public Estudiante getPepe() {
        return pepe;
    }

    public void setPepe(Estudiante pepe) {
        this.pepe = pepe;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTotalDePuntos() {
        return totalDePuntos;
    }

    public void setTotalDePuntos(int totalDePuntos) {
        this.totalDePuntos = totalDePuntos;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }
}
