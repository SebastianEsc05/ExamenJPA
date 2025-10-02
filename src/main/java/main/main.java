package main;

import dao.SuperHeroeDAO;
import entity.IdentidadSecreta;
import entity.SuperHeroe;
import entity.Universo;
import interfaces.ISuperHeroeDAO;

public class main {
    public static void main(String[] args){
        ISuperHeroeDAO dao = new SuperHeroeDAO();

        SuperHeroe spiderman = new SuperHeroe(
                "Spider-Man",
                Universo.MARVEL,
                new IdentidadSecreta("Peter Parker","New York", "Fotografo"),
                "Con gran poder viene gran responsabilidad"
        );

        SuperHeroe batman = new SuperHeroe(
                "Batman",
                Universo.DC,
                new IdentidadSecreta("Bruce Wayne", "Gotham", "Empresario"),
                "Soy la venganza"
        );

        SuperHeroe goku = new SuperHeroe(
                "Goku",
                Universo.INDEPENDIENTE,
                new IdentidadSecreta("Kakarotto","Planeta Tierra","Guerrero"),
                "¡Kamehameha!"
        );

        dao.insertar(spiderman);
        dao.insertar(batman);
        dao.insertar(goku);

        // Listar todos los super heroes
        System.out.println("Lista inicial de superheroes");
        dao.listar().forEach(h -> System.out.println(h.toString()));

        // Modificar un super heroe
        SuperHeroe batmanBD = dao.buscar(batman.getId());
        batmanBD.getIdentidadSecreta().setCiudad("Ciudad gotica");
        dao.actualizar(batmanBD);

        System.out.println("Lista despues de modificar a batman");
         dao.listar().forEach(h -> System.out.println(h.toString()));

        // Eliminar un super heroe
        dao.eliminar(spiderman.getId());
        System.out.println("Lista despues de eliminar a spiderman");
        dao.listar().forEach(h -> System.out.println(h.toString()));
    }
}
