import javax.swing.*;

public class Notas{


    public static void main(String[] args){

        //declarar tamaño del arreglo
        int tamaño =Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de notas "));
        //inicializamos arreglo
        double[] notas =new double[tamaño];
        //inicializa elementos del arreglo
        for(int i =0;i<notas.length;i++){

            //decir cada elemento de cada arreglo
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrse la nota "));

        }//crea un cuadro de  ddialogo con el mensaje mas llamar metodo
        JOptionPane.showMessageDialog(null,"la nota mayor "+ calcularmayornornota(notas));
        JOptionPane.showMessageDialog(null,"la nota menor "+calcularmenornota (notas));
        JOptionPane.showMessageDialog(null,"la definitiva de la nota es "+calculardefinitiva(notas));

        //para comparar sultado con el objetivo de buscar nota
        double buscarnota=Double.parseDouble((JOptionPane.showInputDialog("que nota quiere buscar ")));

        double posicion=buscarnotas(notas,buscarnota);
        mostrarresumen(notas);





    }
    public static double  calcularmayornornota(double[]notas){

       double notamayor=0;

       for(int i=0 ;i<notas.length;i++){
           if(notas[i]>notamayor){
              notamayor=notas[i];

           }




       }


       return notamayor;

    }
    public static double calcularmenornota (double[] notas){

       // double notamenor=0;//profe por que si pongo esta varible
        //si es igual ala logica de nota mayor me retorno nota buscada 0

        double notamenor=notas[0];//solucion temporal

        for(int i=0 ;i <notas.length;i++){
            if(notas[i]<notamenor){
                notamenor=notas[i];


            }



        }



        return notamenor;

    }

    public static double calcularnumerorepite(double []notas){

        double repite=0;

        for(int i=0;i<notas.length;i++){
            for(int j=i+1; j<notas.length; j++){
                if(notas[i]==notas[j]){
                    repite=notas[i];

                }


            }


        }


        return repite ;
    }
    // mi funcion nueva buscar nota
    public static double buscarnotas(double[]notas,double posicion){
        double notaencontrada=0;

        for(int i=0 ; i<notas.length;i++){

            if(notas[i]==posicion){
                notaencontrada=notas[i];
                JOptionPane.showMessageDialog(null,"nota encontrada"+notas[i]);
            }
        }




        return notaencontrada;


    }
    public static double calculardefinitiva (double notas[]){
        double promedio=0; double suma=0;

        for(int i=0;i<notas.length;i++){

            suma+=notas[i];
            promedio=suma/notas.length;

        }



        return promedio;




    }
    public static void mostrarresumen(double[]notas){
         String mensaje="la definitiva es "+calculardefinitiva(notas)+"la nota menor es "+calcularmenornota(notas)+"la nota mayor es "+calcularmayornornota(notas)+"la nota repetidad es "+calcularnumerorepite(notas);
         JOptionPane.showMessageDialog(null,mensaje);




    }
}