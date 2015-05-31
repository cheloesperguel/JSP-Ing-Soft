/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

/**
 *
 * @author Chelo
 */
public class Tablero {
    
    String colorOscuro;
    String colorClaro;

    public Tablero(String colorOscuro, String colorClaro) {
        this.colorOscuro = colorOscuro;
        this.colorClaro = colorClaro;
    }
    
    public String dibujaTablero(){
        String salida="";
        salida=salida+"<table style=\" float:left\" border='2px' width='400' height='400'>";
        for(int i=0;i<8;i++){
                    salida=salida+" <tr> ";
                    for(int j=0;j<8;j++){
                        if(i%2==0){
                           if(j%2==0){
                               salida=salida+"<td style=\" background-color:"+ colorOscuro+" \" > </td> ";
                           }else{
                               salida=salida+"<td style=\" background-color:"+ colorClaro+" \" > </td> ";                            
                           }                           
                        }else{
                            if(j%2==0){
                               salida=salida+"<td style=\" background-color: "+ colorClaro+" \" ></td> ";
                           }else{
                               salida=salida+"<td style=\" background-color: "+ colorOscuro+" \" ></td> ";                            
                           } 
                        }

                    }
                    salida=salida+"</tr>";
                    
                    
                }
        salida=salida+"</table>";
        return salida;
    }
    
}
