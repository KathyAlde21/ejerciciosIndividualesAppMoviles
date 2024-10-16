/*
package Clase11;
public class _EJemplO1 {
public static void main (String args[]) {

int $algo = 5;
String Var1 = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. "
+ "Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.";

//El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo,
//y los días de entresemana se honraba con su vellorí de lo más fino
int otraCosa;
otraCosa = 6;
System.out.println("El valor de la primera variable es "+ $algo + " y de la segunda es " + otraCosa);

System.out.println("¿Te cuento un cuento?: " + Var1); 
}
}
*/

/* Texto Modificado */
package Modulo_2.ejercicioIndividual21; //antes package Clase11 => debe partir en minusculas

public class EjercicioIndividual21 { //antes _EJemplO1 => se quita simbolo
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        int algo = 5; //antes $algo y se quita el simbolo
        String var1 = "En un lugar de la Mancha, de cuyo " //antes Var1 => se cambia a minuscula
                + " nombre no quiero acordarme, no ha mucho tiempo que vivía un "
                + " hidalgo de los de lanza en astillero, adarga antigua, "
                + " rocín flaco y galgo corredor. "
                //reduzco longitud de los dos parrafos
                + " Una olla de algo más vaca que carnero, salpicón las más noches, "
                + " duelos y quebrantos los sábados, lantejas los viernes, "
                + " algún palomino de añadidura los domingos, consumían las tres "
                + " partes de su hacienda.";
        
        /* 
        El resto della concluían sayo de velarte, calzas de velludo para las
        fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se
        honraba con su vellorí de lo más fino
        */
        //antes estaba comentado con // y ahora /**/
        
        int otraCosa = 6; //antes estaba en dos líneas
        
        System.out.println("El valor de la primera variable es "+ algo + " y de la segunda es " + otraCosa);
        //reeescrito al cambiar nombres de variables
    }
}
