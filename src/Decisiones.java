public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

// codigo que prueba los operadores relacionales
//        if (fechaDeLanzamiento >= 2022) {
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.println("Peliculas Retro que aun vale la pena ver");


// alt + 124  para este operador || (logico)
        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }

        }
    }

