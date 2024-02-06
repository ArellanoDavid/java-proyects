/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

/**
 *
 * @author FP
 */
public class Caballo {
    private String color;
    private int fila;
    private int columna;

    public Caballo(String color, int fila, int columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    private boolean compruebaMovimiento(int fila, int columna){
    
        return fila == this.fila && this.columna == columna;
    }
    
    public boolean movimiento(int fila, int columna){
        
        int nuevaFila = fila, nuevaCol = columna;
        
        //primer mov
        nuevaFila -= 2;
        nuevaCol += 1;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //segundo mov
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila -= 1;
        nuevaCol += 2;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //TERCERO
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila += 1;
        nuevaCol += 2;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //CUARTO
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila += 2;
        nuevaCol += 1;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //Quinto
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila += 2;
        nuevaCol -= 1;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //SEXTO
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila += 1;
        nuevaCol -= 2;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
         //SEPTIMO
         nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila -= 1;
        nuevaCol -= 2;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        //OCTAVO
        nuevaFila = fila; 
        nuevaCol = columna;
        nuevaFila -= 2;
        nuevaCol -= 1;
        if(compruebaMovimiento(nuevaFila, nuevaCol)){
            return true;
        }
        
        return false;
    }
    
}

