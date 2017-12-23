
package practice;

/**
 *
 * @author JHON-MAYKOL
 *///OPERDOR DIAMANTE, Y L T UN TIPO DE DATO,NO PPRESENTA NAD EN ESPECIFICO ,SINO EL TIPO DE O
public class Elemento<T> {
    private T dato;
    
    public Elemento(){}
    
    public void setDato(T t) { this.dato = t;}
    
    public T getDato(){ return this.dato;}
}
 /*LinkedList<String> Lista = new LinkedList<String>();
        Lista.add("asdfg");
        String txt = Lista.getFirst();
        System.out.println(txt);  
        
        
        Elemento<Double> el = new Elemento<>();
        el.setDato(13.2);
        System.out.println(el.getDato());*/

/*
integer,obeto que represetnata,es algo pa saber.abstract 
ambien podemos crear nuestras propias clases parametrizadas , de cada tipo de dato generico
*/
   