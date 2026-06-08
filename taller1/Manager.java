package com.taller1;

public class Manager {
    public static void main(String[] args) {
        Academia[][] sucursales={
        
        // Sucursal A
            {
                new Academia("Matemáticas", 18),
                new Academia("Física", 25),
                new Academia("Química", 20)
            },

            // Sucursal B
            {
                new Academia("Matemáticas", 32),
                new Academia("Física", 15),
                new Academia("Química", 28),
                new Academia("Biología", 32),
                new Academia("Historia", 32),
                new Academia("Geografía", 32)
            },

            // Sucursal C
            {
                new Academia("Literatura", 18),
                new Academia("Artes", 25),
                new Academia("Botánica", 20),
                new Academia("Programación", 34)
            }


        };

         String[] nombresSucursales = { "Sucursal A","Sucursal B","Sucursal C"};
           

         for (int i = 0; i < sucursales.length; i++) {

            System.out.println("\n" + nombresSucursales[i]);

            for (int j = 0; j < sucursales[i].length; j++) {
                System.out.println(sucursales[i][j]);
            }
        }

    }
}
