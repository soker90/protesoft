package dominio;

public class Voluntario {
    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String edad;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String fecha_nacimiento;
    private String telefono;
    private Boolean conocimientos;
    private String disponibilidad; 
    private String horario;

    public Voluntario(int id, String dni,String nombre, String apellidos, String edad, String direccion, String poblacion, String provincia, String fecha_nacimiento, String telefono, Boolean conocimientos, String disponibilidad, String horario) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.conocimientos = conocimientos;
        this.disponibilidad = disponibilidad;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public Boolean getConocimientos() {
        return conocimientos;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public String getHorario() {
        return horario;
    }
    
    
    
    
}
