public class Main {
    public static void main(String[] args) throws Exception {
        Contenedores contenedorFresas = new Contenedores(30);
        Contenedores contenedorManzanas = new Contenedores(30);
        Contenedores contenedorMembrillo = new Contenedores(30);

        Bodega bodega = new Bodega(200);

        //Camion 1
        bodega.enqueue(new Cajas("Fresa", 16));
        bodega.enqueue(new Cajas("Manzana", 17));
        bodega.enqueue(new Cajas("Fresa", 15));
        bodega.enqueue(new Cajas("Manzana", 16));
        bodega.enqueue(new Cajas("Membrillo", 14));
        bodega.enqueue(new Cajas("Fresa", 14));
        bodega.enqueue(new Cajas("Manzana", 15));
        //Camion 2
        bodega.enqueue(new Cajas("Membrillo", 13));
        bodega.enqueue(new Cajas("Fresa", 13));
        bodega.enqueue(new Cajas("Manzana", 14));
        bodega.enqueue(new Cajas("Membrillo", 12));
        bodega.enqueue(new Cajas("Fresa", 12));
        bodega.enqueue(new Cajas("Manzana", 13));
        //Camion 3
        bodega.enqueue(new Cajas("Membrillo", 11));
        bodega.enqueue(new Cajas("Manzana", 12));
        bodega.enqueue(new Cajas("Manzana", 11));
        bodega.enqueue(new Cajas("Manzana", 10));
        bodega.enqueue(new Cajas("Fresa", 11));
        bodega.enqueue(new Cajas("Membrillo", 10));
        bodega.enqueue(new Cajas("Fresa", 10));
        System.out.println("La bodega cuenta con:");

        while(!bodega.isEmpty())
        {
            Cajas cajasx = bodega.dequeue();
            System.out.println("Caja de frutas del tipo: " + cajasx.getNombre() + " con el peso de " + cajasx.getPeso() );			
            if (cajasx.getNombre() == "Fresa"){
                contenedorFresas.push(cajasx);
            }
            if (cajasx.getNombre() == "Membrillo"){
                contenedorMembrillo.push(cajasx);
            }
            if (cajasx.getNombre() == "Manzana"){
                contenedorManzanas.push(cajasx);
            }
        }

            System.out.println("En contenedor de fresas");
            while(!contenedorFresas.isEmpty())
            {
             Cajas cajasy = contenedorFresas.pop();
             System.out.println("Caja del tipo "  + cajasy.getNombre() + " con peso en kilos de: " + cajasy.getPeso());
            }

            System.out.println("En contenedor de membrillo");
            while(!contenedorMembrillo.isEmpty())
            {
             Cajas cajasy = contenedorMembrillo.pop();
             System.out.println("Caja del tipo "  + cajasy.getNombre() + " con peso en kilos de: " + cajasy.getPeso());
            }
            
            System.out.println("En contenedor de manzanas");
            while(!contenedorManzanas.isEmpty())
            {
             Cajas cajasy = contenedorManzanas.pop();
             System.out.println("Caja del tipo "  + cajasy.getNombre() + " con peso en kilos de: " + cajasy.getPeso());
            }
        }


}
//sys("Caja de frutas del tipo: " + cajasx.getNombre() + " con el peso de " + cajasx.getPeso() );			
