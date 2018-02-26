
package exemploarraysbidimensional;

import javax.swing.JOptionPane;


/**
 *
 * @author dfernandezguerreiro
 */
public class Notas {
    int[][]notas=new int[4][3];
    int[]medias=new int[notas.length];
    String[]nomes={"Roberto     ","Maria       ","Pepe        ","Ana         "};
    String[]modulos={"           Prog      ","BD       ","CD       "};

    public void crearTabla(){
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                notas[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Agregar nota:"));
            }
        }
    }
    
    public void amosar(){
        System.out.println("\n");
        for(int fm=0;fm<modulos.length;fm++){ //fila modulos
            System.out.print(modulos[fm]);
        }
        System.out.println(" ");
            for(int f=0;f<notas.length;f++){
                System.out.print(nomes[f]); //fila nomes alumnos
                    for(int c=0;c<notas[f].length;c++){
                        System.out.print(notas[f][c]+"        "); 
                    } 
                    System.out.println(+medias[f]);
                    System.out.println("\n");
            }
    }
    
    public void mediaAlumno(){
        int acu,f,c;
        for(f=0;f<notas.length;f++){
            acu=0;
            
            for(c=0;c<notas[f].length;c++){
                acu=acu+notas[f][c];
            }
            
            System.out.println("Media = "+acu/notas[f].length);          
        }
    }
    
    public int[] mediaAlumno2(){
        int acu,f,c;
        for(f=0;f<notas.length;f++){
            acu=0;
            
            for(c=0;c<notas[f].length;c++){
                acu=acu+notas[f][c];
            }
            
            medias[f]=acu/notas[f].length;
        }
        return medias;
    }
    
    public void mediaModulo(){
        System.out.println(" ");
        int acu,f,c;
        int[]mediasModulos=new int[notas[0].length];
        for(c=0;c<notas[0].length;c++){
            acu=0;
            
            for(f=0;f<notas.length;f++){
                acu=acu+notas[f][c];
            }
            
            System.out.print(acu/notas.length+", ");
            mediasModulos[c]=acu/notas.length;
        }
    }
    
    public void ordenar(){
        int i,j,k,aux1=0,aux2=0;
        
        for(i=0;i<medias.length;i++){
            for(j=0;j<medias.length;j++){
                if(medias[i]>medias[j]){
                    aux1=medias[i];
                    medias[i]=medias[j];
                    medias[j]=aux1;
                    for(k=0;k<notas[0].length;k++){
                        aux2=notas[i][k];
                        notas[i][k]=notas[j][k];
                        notas[j][k]=aux2;
                    }
                }
            }
           
        }
        
    }
}
