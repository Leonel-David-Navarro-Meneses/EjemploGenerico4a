package genericos;


/*
 * @param <T>:
 */

public class ClaseGenerica<T>{
    //T esun tipo de dato abstracto que sera reeemplazado al monmento de usar la clase
    T objeto;//objeto de tipo T

    //constructor
    public ClaseGenerica(T o){
      this.objeto = o;
  
  }
  public T getObjeto(){
    return this.objeto;
  }

  public void setObjeto(T o){
this.objeto = o;
  }

  public void getType(){
System.out.println("el tipo de T efectivo es: " + this.objeto.getClass().getName());   
  }
}
