package principal;


import dominio.Gerente;
import dominio.Empleado;
import dominio.Persona;

public class Principal {
    
    public static void main(String[] args) {
      //INDEXACIÓN DE OBJ:
        Persona pers1=new Persona("Alberto", "Ruiz");
        Persona pers2=new Persona("Carlos", "De las Heras");
        Persona pers3=new Persona("Antonio","Guzman");
        Persona pers4=new Persona("Esther","Ortega");
        Empleado em1=new Empleado("12345689",2200.3,"Jesús","Quintero");
        Gerente g1=new Gerente("RRHH", "ADE", "12345678", 1222.0, "Pepe", "Rodríguez");
        
        //System.out.println("pers1 ="+pers1);
        //System.out.println("pers2 ="+pers2);
        
      //Declaro un array de objeto Persona
            Persona empleados[]={pers1, pers2};
            
      //Creando matriz e introduciendo objetos:
        //OPCIÓN CORTA:
            Persona pers[][]={{pers1,pers2},{pers3,pers4}};
            //Persona pers[]={pers1,pers2,pers3,pers4};
        /*OPCIÓN LARGA:
            Persona pers[][]= new Persona [2][2];
                pers[0][0]=pers1;
                pers[0][1]=pers2;
                pers[1][0]=pers3;
                pers[1][1]=pers4;*/
            
        
        /*for (int i = 0; i < empleados.length; i++) {
            System.out.println("empleados["+i+"]: "+empleados[i]);
        }*/
        //Creo un Array/Vector de 'numeros':
        Integer numeros[]={15,20,13,24};
        
      //RECORRE Y MUESTRA EL ARRAY:
        for (int i = 0; i < pers.length; i++) {
            //Divido entre socios y directores dependiendo de su posición
            if(i==0)System.out.println("Socio: ");
            else System.out.println("\nDirector: \n");
            for (int j = 0; j <pers[i].length; j++) {
                System.out.println("Empleado["+i+"] ["+j+"] ="+pers[i][j]);
            }
        }
        
        
       System.out.println("Imprimiendo nº: ");
       imprimir(numeros);
       System.out.println("Imprimiendo empleados: ");
       imprimir(pers);
       
     //IMPRIMIENDO Nº CON MÉTODO DE ARG VARIABLES:
       //primera llamada con 3 arg:
       imprimirNumeros(1,2,4);
       //segunda llamada con 2 arg:
       imprimirNumeros(3,7);
       
       //Llamo al método mostrarDetalle
       mostrarDetalle(g1);
       //mostrarDetalle(pers2);
       //mostrarDetalle(em1);

       
        
    }
    //definimos un unico metodo con un parametro como Object(utiliza la clase padre Integer)
    public static void imprimir(Object lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista["+i+"] = "+lista[i]);
        }
    }
    
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero["+i+"]="+numeros[i]);
        }
    }
    
    //INSTANCEOF MUESTRA A QUÉ CLASE O CLASES PERTENECE EL OBJETO:
    public static void mostrarDetalle(Persona persona){
        if(persona instanceof Persona){
            System.out.println("Es una instancia de persona: ");
            
        }
        if(persona instanceof Empleado){
            System.out.println("Es una instancia de empleado: "+((Empleado) persona).getSueldo());
            
        }
        if(persona instanceof Gerente){
            System.out.println("Es una instancia de gerente: "+((Gerente) persona).getDepartamento());
            
        }
    }
}
