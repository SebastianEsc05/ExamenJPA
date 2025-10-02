package interfaces;

import entity.SuperHeroe;

import java.util.List;

public interface ISuperHeroeDAO {
    void insertar(SuperHeroe e);
    void actualizar(SuperHeroe e);
    void eliminar(long id);
    SuperHeroe buscar (Long id);
    List<SuperHeroe> listar();

}
