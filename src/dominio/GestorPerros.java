package dominio;

import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import persistencia.Agente;

public class GestorPerros {
    public static boolean BorrarPerro(int id) {
        boolean resultado=false;
        try {
                int rs = Agente.getAgente().delete("DELETE FROM protesoft_perros  WHERE id="+id);

                if(rs!=0){
                        resultado=true;
                }

        } catch (Exception e) {
            System.out.println(e);
     }

        return resultado;
    }

    public static boolean InsertarPerro()  {
        boolean resultado=false;
        try {
            int rs = Agente.getAgente().insert("INSERT INTO protesoft_perros "
                    + "(nombre) values ('')");

                if(rs!=0){
                        resultado=true;
                }
        } catch (Exception e) {
               System.out.println(e);
        }

        return resultado;
    }

    public static boolean ModificarPerro(int id, String nombre, 
            boolean sexo, String raza, String tamanyo, String edad, 
            String fecha, boolean chip, String numero_chip, boolean cachorro,
            boolean ppp, boolean vacunado, boolean esterilizado, 
            String enfermedades, String descripcion,String video) {
        boolean resultado=false;
        try {
                int rs = Agente.getAgente().insert("UPDATE protesoft_perros  SET "
                        + "nombre='"+nombre+"', sexo="+(sexo ? 1 : 0) +",raza='"+raza+
                        "',tamanyo='" + tamanyo +"',edad='" + edad + "',fecha='"
                        + fecha +"', chip="+(chip ? 1 : 0)+", numero_chip='" + numero_chip
                        +"', cachorro=" +(cachorro ? 1 : 0)+",ppp="+(ppp ? 1 : 0)+","+" vacunado="
                        +(vacunado ? 1 : 0)+", esterilizado="+(esterilizado ? 1 : 0)+
                        ", enfermedades='"+ enfermedades+"', descripcion='"
                        +descripcion +"', video='"+video+"' WHERE id="+id);

                if(rs!=0){
                        resultado=true;
                }

        } catch (Exception e) {
            System.out.println(e);
     }

        return resultado;
    }

    public static ArrayList<Perro> SeleccionarTodo() {
        ArrayList<Perro> perros = new ArrayList<>();;
        File carpeta = new File("Perros");
        if (!carpeta.exists()) {
            try{
                carpeta.mkdir();
            } catch(Exception e){
                System.out.println("No se puede crear la carpeta");
            }        
        }


        try {
            ResultSet res = Agente.getAgente().select("SELECT * FROM protesoft_perros");
            while(res.next()){
                perros.add(new Perro(Integer.parseInt(res.getString(1)), res.getString(2), 
                        Boolean.parseBoolean(res.getString(3)), res.getString(4), res.getString(5),
                        res.getString(6), res.getString(7), Boolean.parseBoolean(res.getString(8)),
                        res.getString(9), Boolean.parseBoolean(res.getString(10)), Boolean.parseBoolean(res.getString(11)),
                        Boolean.parseBoolean(res.getString(12)), Boolean.parseBoolean(res.getString(13)), res.getString(14),
                        res.getString(15), res.getString(16)));   
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

        return perros;
    }
    
    public static Perro SeleccionarPerro(int id) {
        Perro p = null;
        try {
            ResultSet res = Agente.getAgente().select("SELECT * FROM "
                    + "protesoft_perros where id="+String.valueOf(id));
            p = new Perro(Integer.parseInt(res.getString(1)), res.getString(2), 
                        Boolean.parseBoolean(res.getString(3)), res.getString(4), res.getString(5),
                        res.getString(6), res.getString(7), Boolean.parseBoolean(res.getString(8)),
                        res.getString(9), Boolean.parseBoolean(res.getString(10)), Boolean.parseBoolean(res.getString(11)),
                        Boolean.parseBoolean(res.getString(12)), Boolean.parseBoolean(res.getString(13)), res.getString(14),
                        res.getString(15), res.getString(16));

        } catch (Exception e) {
            System.out.println(e);
     }

        return p;
    }

    public static boolean ModificarPerro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}