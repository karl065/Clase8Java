package arraylistclase;

import java.util.ArrayList;

public class ArrayListClase {

    public static void main(String[] args) {

        ArrayList<String> arColor = new ArrayList<>();

        System.out.println("Tamaño de ArrayList en la creacion es: " + arColor.size());

        arColor.add("Rojo");
        arColor.add("Verde");
        arColor.add("Azul");
        arColor.add("Blanco");
        arColor.add("Negro");

        System.out.println("Tamaño de ArrayList despues de agregar elementos es: " + arColor.size());

        System.out.println("Lista de todos los elemntos: " + arColor);

        arColor.remove("Azul");

        System.out.println("Lista despues de eliminar Azul: " + arColor);
        System.out.println("Tamaño de ArrayList en la creacion es: " + arColor.size());

        System.out.println("La lista contiene a Rojo? " + arColor.contains("Rojo"));

        ArrayList<Integer> numero = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            numero.add(i);

        }
        System.out.println("Elementos del ArrayList numero");
        for (int i = 0; i<=(numero.size())-1; i++){
            System.out.println(numero.get(i));
            //System.out.println(i);
        }

    }

}
