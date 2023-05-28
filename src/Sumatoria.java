import java.util.Arrays;

public class Sumatoria {
    public void suma(){
        int [] numeros = { 50, 10,15,5};
        int [] ordenados = numeros;
        int sumatoria = 0;
        double media=0;


        Arrays.sort(ordenados);



        double mediana = (ordenados[numeros.length/2]+ordenados[(numeros.length/2)-1])/2;

        for (int i = 0;i<numeros.length;i++){
            sumatoria = sumatoria + numeros [i];
        }

        media =(double) sumatoria/ numeros.length;


        System.out.println("Se sumaron "+numeros.length+ "Elementos");
        System.out.println("La sumatoria de los elementos del arreglo es: "+ sumatoria);
        System.out.println(" Los elementos del arreglo ordenados son: "+Arrays.toString(ordenados));
        System.out.println("la mediana es: "+mediana);
        System.out.println("media:"+media);
    }

}
