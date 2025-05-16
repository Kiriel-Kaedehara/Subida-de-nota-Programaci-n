/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tirardadosdnd;

/**
 *
 * @author Kiriel
 * @version 1.0 Clase hija o subclase que hereda todo el comportamiento de su
 * super clase o clase padre "Dado"
 */
/**
 * Este constructor por defecto llama al constructor de la clase padre e
 * inicializa la variable "caras" a 4, ya que este dado es el D4
 */
public final class DadoD4 extends Dado {

    public DadoD4() {
        super();
        this.caras = 4;
    }//Constructor por defecto, hereda el constructor de la clase padre

}//class
