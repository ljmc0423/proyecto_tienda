/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra1;
import java.util.Scanner;
/**
 *
 * @author ljmc2
 */
public class Matta_Lorenzo_Tienda {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        boolean cajaabierta=true,comprarealizada=false;
        double caja=0,deposito=0;
        String opcionmenu="",opcionproducto="",opciondist="",productoestrella="";
        int compra=0,venta=0,comprastotales,ventastotales;
        double totalcompra=0,totalventa=0,volumencompras,volumenventas;
        int azucar=0,avena=0,trigo=0,maiz=0;//inventarios
        /*notas
        titulo para cada opcion:
          ** VENTAS **
        
                cosas
        
        desea comprar otro producto
        no dejar compras si no hay plata
        
        */
        while(true){
            System.out.println("****************CAJA****************"
                        +    "\n1. Abrir caja"
                        +    "\n2. Ventas"
                        +    "\n3. Compras"
                        +    "\n4. Reportes"
                        +    "\n5. Cerrar caja"
                        +    "\n6. Salir del sistema"
                        +    "\n************************************"
                        +    "\nIngresar una opcion.");
            do{
                opcionmenu=lea.next();
                if(!opcionmenu.equals("1")&&!opcionmenu.equals("2")
                    &&!opcionmenu.equals("3")&&!opcionmenu.equals("4")
                    &&!opcionmenu.equals("5")&&!opcionmenu.equals("6"))
                    System.out.println("Ingrese una opcion valida.");
                
            }while(!opcionmenu.equals("1")&&!opcionmenu.equals("2")
                    &&!opcionmenu.equals("3")&&!opcionmenu.equals("4")
                    &&!opcionmenu.equals("5")&&!opcionmenu.equals("6"));
            
            switch(opcionmenu){
                case"1"://abrir caja
                    if(cajaabierta==true){
                        System.out.println("Cantidad en caja: L."+caja);
                        System.out.println("Ingrese la cantidad de efectivo a guardar en caja:");
                        do{
                            deposito=lea.nextDouble();
                            if(deposito<0)
                                System.out.println("Cantidad a depositar no puede ser menor a 0.");
                        }while(deposito<0);
                        caja+=deposito;
                        System.out.println("Cantidad en caja: L."+caja);
                        System.out.println("Oprima enter para continuar.");
                        lea.next();
                    }else{
                        System.out.println("Caja abierta.");
                        cajaabierta=true;
                        System.out.println("Oprima enter para continuar.");
                        lea.next();
                    }
                    break;
                case"2"://ventas(enseñar inventarios)
                    
                    break;
                case"3"://compras
                    System.out.println("**************COMPRAS*************"
                            +        "\n----------------------------------"
                            +        "\n|Codigo|Producto|     Precio     |"
                            +        "\n|  1   | Azucar |Lps.      25    |"
                            +        "\n|  2   | Avena  |Lps. (B)20 (C)22|"
                            +        "\n|  3   | Trigo  |Lps.      30    |"
                            +        "\n|  4   | Maiz   |Lps.      18    |"
                            +        "\n----------------------------------");
                    do{
                        opcionproducto=lea.next();
                        if(!opcionproducto.equals("1")&&!opcionproducto.equals("2")&&
                            !opcionproducto.equals("3")&&!opcionproducto.equals("4"))
                            System.out.println("Ingresar una opcion valida.");
                    }while(!opcionproducto.equals("1")&&!opcionproducto.equals("2")&&
                            !opcionproducto.equals("3")&&!opcionproducto.equals("4"));
                    switch(opcionproducto){
                        case"1"://azúcar
                            
                            break;
                        case"2"://avena(OPTIMIZAR)
                            System.out.println("Comprará del distribuidor B o C?");
                            do{
                                opciondist=lea.next().toLowerCase();
                                if(!opciondist.equals("b")&&!opciondist.equals("c"))
                                    System.out.println("Ingrese una opción válida.");
                            }while(!opciondist.equals("b")&&!opciondist.equals("c"));
                            
                            switch(opciondist){
                                case"b":
                                    System.out.println("Ingrese la cantidad de kilos de avena a comprar:");
                                    do{
                                        compra=lea.nextInt();
                                        if(compra<0){
                                            System.out.println("Ingrese una cantidad válida.");
                                        }
                                    }while(compra<0);
                                    totalcompra=compra*20;
                                    if(totalcompra>caja){
                                        System.out.println("Monto en caja: L."+caja+
                                                         "\nTotal de compra: L. "+totalcompra
                                                +        "\nFondos insuficientes para realizar compra."
                                                +        "\nOprima enter para regresar al menu principal.");
                                        lea.next();
                                        
                                    }else{
                                        avena+=compra;
                                        System.out.println("Monto en caja: L."+caja);
                                        caja-=totalcompra;
                                        System.out.println("Total de compra: L. "+totalcompra
                                                +        "\nMonto en caja tras compra: L. "+caja
                                                +        "\nCompra realizada."
                                                +        "\nOprima enter para regresar al menu principal.");
                                        lea.next();
                                    }
                                    break;
                                case"c":
                                    System.out.println("Ingrese la cantidad de kilos de avena a comprar:");
                                    do{
                                        compra=lea.nextInt();
                                        if(compra<0){
                                            System.out.println("Ingrese una cantidad válida.");
                                        }
                                    }while(compra<0);
                                    totalcompra=compra*22;
                                    if(totalcompra>caja){
                                        System.out.println("Monto en caja: L."+caja+
                                                         "\nTotal de compra: L. "+totalcompra
                                                +        "\nFondos insuficientes para realizar compra."
                                                +        "\nOprima enter para regresar al menu principal.");
                                        lea.next();
                                        
                                    }else{
                                        avena+=compra;
                                        System.out.println("Monto en caja: L."+caja);
                                        caja-=totalcompra;
                                        System.out.println("Total de compra: L. "+totalcompra
                                                +        "\nMonto en caja tras compra: L. "+caja
                                                +        "\nCompra realizada."
                                                +        "\nOprima enter para regresar al menu principal.");
                                        lea.next();
                                    }
                                    break;
                            }
                            
                            System.out.println("Oprima enter para continuar.");
                            lea.next();
                            break;
                        case"3"://trigo
                            
                            break;
                        case"4"://maíz
                            
                            break;
                    }
                    break;
                case"4"://reportes
                    
                    break;
                case"5"://cierre de caja
                    System.out.println("Caja cerrada. Cuánto desea depositar en el banco?(Maximo(60%): "+caja*0.6+")");
                    
                    do{
                        deposito=lea.nextDouble();
                        if(deposito>caja*0.6||deposito<0)
                            System.out.println("Cantidad ingresada fuera de limite permitido. Ingresar deposito de nuevo.");
                    }while(deposito>caja*0.6);
                    
                    caja-=deposito;
                    cajaabierta=false;comprarealizada=false;
                    
                    System.out.println("Oprima enter para continuar.");
                    lea.next();
                    break;
                case"6"://cerrar programa
                    System.out.println("Programa finalizado.");
                    System.exit(0);
                    break;
            }
        }
        
    }
}
