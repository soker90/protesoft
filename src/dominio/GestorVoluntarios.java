package dominio;

import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import persistencia.Agente;

public class GestorVoluntarios {
    public static boolean BorrarVoluntario(int id) {
        boolean resultado=false;
        try {
                int rs = Agente.getAgente().delete("DELETE FROM "
                        + "protesoft_voluntarios WHERE id="+id);

                if(rs!=0){
                        resultado=true;
                }

        } catch (Exception e) {
            System.out.println(e);
     }

        return resultado;
    }

    public static boolean InsertarVoluntario()  {
        boolean resultado=false;
        try {
            int rs = Agente.getAgente().insert("INSERT INTO protesoft_voluntarios "
                    + "(nombre) values ('')");

                if(rs!=0){
                        resultado=true;
                }
        } catch (Exception e) {
               System.out.println(e);
        }

        return resultado;
    }

    public static boolean ModificarVoluntario(int id, String dni,String nombre,
            String apellidos, String edad, String direccion, String poblacion,
            String provincia, String fecha_nacimiento, String telefono,
            Boolean conocimientos, String disponibilidad, String horario) {
        boolean resultado=false;
        try {
                int rs = Agente.getAgente().insert("UPDATE protesoft_voluntarios  SET "
                        + "nombre='"+nombre+"', dni='"+dni +"',apellidos='"+apellidos+
                        "',edad='" + edad +"',direccion='" + direccion + "',poblacion='"
                        + poblacion +"', provincia='"+provincia+"', fecha_nacimiento='" + fecha_nacimiento
                        +"', telefono='" +telefono+"',conocimientos="+(conocimientos ? 1 : 0)+","+
                        " disponibilidad='" +disponibilidad+"', horario='"+horario+"' WHERE id="+id);

                if(rs!=0){
                        resultado=true;
                }

        } catch (Exception e) {
            System.out.println(e);
     }

        return resultado;
    }

    public static ArrayList<Voluntario> SeleccionarTodo() {
        ArrayList<Voluntario> voluntarios = new ArrayList<>();;
        File carpeta = new File("Voluntarios");
        if (!carpeta.exists()) {
            try{
                carpeta.mkdir();
            } catch(Exception e){
                System.out.println("No se puede crear la carpeta");
            }        
        }


        try {
            ResultSet res = Agente.getAgente().select("SELECT * FROM protesoft_voluntarios");
            while(res.next()){
                voluntarios.add(new Voluntario(Integer.parseInt(res.getString(1)),
                        res.getString(2), 
                        res.getString(3), res.getString(4), res.getString(5),
                        res.getString(6), res.getString(7), res.getString(8),
                        res.getString(9), res.getString(10), 
                        Boolean.parseBoolean(res.getString(11)),res.getString(12),
                        res.getString(13)
                        ));   
                File imagenes = new File("Perros"+File.separatorChar+res.getString(1));
                if (!imagenes.exists()) {
                    try{
                        imagenes.mkdir();
                    } catch(Exception e){
                        System.out.println("No se puede crear la carpeta");
                    }        
                }
            }

        } catch (Exception e) {
            System.out.println(e);
     }

        return voluntarios;
    }
    
    public static Voluntario SeleccionarVoluntario(int id) {
        Voluntario v = null;
        try {
            ResultSet res = Agente.getAgente().select("SELECT * FROM "
                    + "protesoft_voluntarios where id="+String.valueOf(id));
            v = new Voluntario(Integer.parseInt(res.getString(1)),
                        res.getString(2), 
                        res.getString(3), res.getString(4), res.getString(5),
                        res.getString(6), res.getString(7), res.getString(8),
                        res.getString(9), res.getString(10), 
                        Boolean.parseBoolean(res.getString(11)),res.getString(12),
                        res.getString(13)
                        );

        } catch (Exception e) {
            System.out.println(e);
     }

        return v;
    }    
}