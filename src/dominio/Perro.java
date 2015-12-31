package dominio;

import persistencia.Agente;

public class Perro {
    private int id;
    private String nombre;
    private boolean sexo;
    private String raza;
    private String tamanyo;
    private String edad;
    private String fecha;
    private boolean chip;
    private String numero_chip;
    private boolean cachorro;
    private boolean ppp;
    private boolean vacunado;
    private boolean esterilizado;
    private String enfermedades;
    private String descripcion;
    private String video;

    public Perro() {
    }

    public Perro(int id, String nombre, boolean sexo, String raza, 
            String tamanyo, String edad, String fecha, boolean chip, 
            String numero_chip, boolean cachorro, boolean ppp, boolean vacunado,
            boolean esterilizado, String enfermedades, String descripcion,
            String video) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
        this.tamanyo = tamanyo;
        this.edad = edad;
        this.fecha = fecha;
        this.chip = chip;
        this.numero_chip = numero_chip;
        this.cachorro = cachorro;
        this.ppp = ppp;
        this.vacunado = vacunado;
        this.esterilizado = esterilizado;
        this.enfermedades = enfermedades;
        this.descripcion = descripcion;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public String getEdad() {
        return edad;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isChip() {
        return chip;
    }

    public String getNumero_chip() {
        return numero_chip;
    }

    public boolean isCachorro() {
        return cachorro;
    }

    public boolean isPpp() {
        return ppp;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getVideo() {
        return video;
    }
    
    
    
    
}
