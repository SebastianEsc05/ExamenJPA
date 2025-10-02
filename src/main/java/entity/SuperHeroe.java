package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SuperHeroes")
public class SuperHeroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Universo universo;

    @Embedded
    private IdentidadSecreta identidadSecreta;

    @Transient
    private String fraseIconica;

    public SuperHeroe() {
    }

    public SuperHeroe(String nombre, Universo universo, IdentidadSecreta identidadSecreta, String fraseIconica) {
        this.id = id;
        this.nombre = nombre;
        this.universo = universo;
        this.identidadSecreta = identidadSecreta;
        this.fraseIconica = fraseIconica;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universo getUniverso() {
        return universo;
    }

    public void setUniverso(Universo universo) {
        this.universo = universo;
    }

    public IdentidadSecreta getIdentidadSecreta() {
        return identidadSecreta;
    }

    public void setIdentidadSecreta(IdentidadSecreta identidadSecreta) {
        this.identidadSecreta = identidadSecreta;
    }

    public String getFraseIconica() {
        return fraseIconica;
    }

    public void setFraseIconica(String fraseIconica) {
        this.fraseIconica = fraseIconica;
    }


    @Override
    public String toString() {
        return "SuperHeroe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", universo=" + universo +
                ", identidadSecreta=" + identidadSecreta +
                ", fraseIconica='" + fraseIconica + '\'' +
                '}';
    }
}
