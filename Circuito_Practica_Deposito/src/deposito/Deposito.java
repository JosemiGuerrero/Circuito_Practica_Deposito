package deposito;

/**
 * Clase deposito que nos ha subio la carmen para hcer pruebas jejejejejeje
 * 
 * @author Jozemigué
 * @version 1.0
 */

/* Esta clase representa un  depósito cilíndrico donde se almacena aceite  */

public class Deposito {    

    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;

   /**
    * Deposito sin atributos
    * 
    * Se crea con atributos a 0 y sin id
    */
    public Deposito () { //Lo que hace es llamar al constructor con parámetros pasándole valores vacíos
        this(0,0,"");            } //Cierre del constructor


    /**
     * Creamos un deposito con los atributos que le pasamos al constructor
     * Comprueba que ninguno de los float sea menor o igual a 0 y que el id esté vacío
     * En ese caso le dará valores predeterminados e imprimirá por consola que ha hecho eso
     * 
     * @param valor_diametro valor del diametro introducido
     * @param valor_altura valor de la altura introducido
     * @param valor_idDeposito valor del id introducido
     */
    public Deposito (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   } //Cierre del constructor

    
    /**
     * Método para cambiar los valores del deposito.
     * Si los valores son menores o igual a 0 o el id es vacio se inicializará todo a 0 e id vacio
     * 
     * @param valor_idDeposito valor del id introducido
     * @param valor_diametro valor del diametro introducido
     * @param valor_altura valor de la altura introducido
     */
    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el depósito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un método y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     } //Cierre del método

    
   /**
    * Devuelve el diametro del depósito
    *  
    * @return diametro del deposito
    */
    public float getDiametro () { return diametro; } //Método de acceso
    
    /**
     * Devuelve la altura del deposito
     * 
     * @return altura del deposito
     */
    public float getAltura () { return altura; } //Método de acceso
    public String getIdDeposito () { return idDeposito; } //Método de acceso
    public float valorCapacidad () { //Método tipo función
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    

} //Cierre de la clase