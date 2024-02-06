/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

/**
 *
 * @author FP
 */
public class Tablero {
    String[][]tablero;
    private Caballo caballo;

    public Tablero() {
        tablero=new String [8][8];
        inicializar();
        this.caballo =   new Caballo("blanco",3,3);
        tablero[3][3]="C";
    }
    public Tablero(Caballo caballo){
        tablero=new String [8][8];
        inicializar();
        tablero[caballo.getFila()][caballo.getColumna()]="C";
    }
    public void visualizar(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print( tablero[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    public void inicializar(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]="-";
            }
           
            
        }
    }
    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }
    public void actualizarTablero(Caballo caballo){
        tablero[caballo.getFila()][caballo.getColumna()]="C";
    }
    public boolean esMovimientoValido(int fila,int columna){
        
        //es movimiento 1
        if ((fila==caballo.getFila()-2)&&(columna==caballo.getColumna()+1)) {
            return true;
            //movimiento 2
        }else if((fila==caballo.getFila()-2)&&(columna==caballo.getColumna()-1)){
            return true;
            //movimiento3
        }else if((fila==caballo.getFila()-1)&&(columna==caballo.getColumna()+2)){
            return true;
            //movimiento 4
        }else if((fila==caballo.getFila()-1)&&(columna==caballo.getColumna()-2)){
            return true;
            //movimiento 5
        }else if((fila==caballo.getFila()+2)&&(columna==caballo.getColumna()-1)){
            return true;
            //movimiento6
        }else if((fila==caballo.getFila()+2)&&(columna==caballo.getColumna()+1)){
            return true;
            //movimiento7
        }else if((fila==caballo.getFila()+1)&&(columna==caballo.getColumna()-2)){
            return true;
            //movimiento8
         }else if((fila==caballo.getFila()+1)&&(columna==caballo.getColumna()+2)){
            return true;
                }
        return false;
    }
}
        
    

    
   
    

