/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tirardadosdnd;

import java.util.Random;
import java.util.HashMap;

/**
 *
 * @author Kiriel
 * @version 1.0 Esta clase abstracta "Dado" es la superClase o Clase Padre de la
 * cual van a heredar las subclases o clases Hijas. Contiene todo el
 * funcionamiento que van a heredar las clases hijas y como no es necesario
 * sobreescribir nada en las clases hijas la instrucción override no ha sido
 * implementada con tal fin
 */
public abstract class Dado {

    protected int caras;
    protected HashMap<String, Integer> resultado;
    protected int contador;

    /**
     * Este es el constructor por defecto, se inicia todo a 0 y se instancia el
     * HashMap Las caras es la variable que más se va a tener en cuenta, ya que
     * es variable principal por llamarla de alguna forma ya que, todo el
     * programa gira entorno a las "caras" de los diferentes dados, además la
     * variable contador, será de gran importancia en uno de los métodos
     * personalizados
     */
    public Dado() {
        caras = 0;
        resultado = new HashMap<>();
        contador = 0;
    }//Constructor por defecto

    /**
     * Método getter para devolver las "caras"
     *
     * @return caras
     */
    public int getCaras() {
        return caras;
    }//Getter de caras

    /**
     * Método getter para devolver el hashMap
     *
     * @return resultado
     */
    public HashMap<String, Integer> getResultado() {
        return resultado;
    }//Getter de HashMap

    /**
     * Método getter para devolver el "contador"
     *
     * @return contador
     */
    public int getContador() {
        return contador;
    }//Getter de Contador

    /**
     * Método setter para establecer la cantidad de caras
     * @param caras
     */
    public void setCaras(int caras) {
        this.caras = caras;
    }//Setter de caras

    /**
     * Método setter para establecer el hashMap
     * @param resultado
     */
    public void setResultado(HashMap<String, Integer> resultado) {
        this.resultado = resultado;
    }//Setter de HashMap

    /**
     * Método setter para establecer la posición del contador
     * @param contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }//Setter de contador

    /**
     * Método personalizado que permite "tirar" o realizar la "tirada" de un
     * dado
     *
     * @return tirar
     */
    public int tirar() {
        Random cara = new Random();
        int tirar = cara.nextInt(1, caras + 1);
        return tirar;
    }//método personalizado para tirar dado

    /**
     * Método personalizado que permite guardar los resultados en un hashMap
     * @param nCaras
     */
    public void guardarResultados(int nCaras) {
        String llave = "Resultado" + contador;
        resultado.put(llave, nCaras);
        contador++;
    }//método personalizado para guardar los resultados

    /**
     * Método personalizado que permite mostrar los resultados de cada dado, implementado como hashmap
     * @return muestra
     */
    public String muestraDeResultados() {
        String muestra = "";
    if (resultado.isEmpty()) {
        muestra = "No hay ningún resultado del dado D" + caras;
    }//if
    else{
        for (String llave : resultado.keySet()) {
            muestra += llave + ": " + resultado.get(llave) + "\n";
        }
    }//else
    return muestra;
    }//método personalizado para mostrar los resultados

    /**
     * toString que muestra "Dado", no tiene implementación como tal, solo ha
     * sido implementada por si en un futuro fuera factible usarla
     *
     * @return "Dado"
     */
    @Override
    public String toString() {
        return "Dado";
    }
}//class

