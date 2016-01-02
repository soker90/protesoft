package dominio;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import persistencia.Agente;
import presentacion.FormInicio;

public class GestorUsuarios {
    public static int Login(String usuario, String pass) {
        int id = 0;
        try {
            ResultSet res = Agente.getAgente().select("SELECT id FROM "
                    + "protesoft_usuarios where usuario='"+usuario+"' and clave='"+pass+"'");
            id = Integer.parseInt(res.getString(1));

        } catch (Exception e) {
            System.out.println("Usuario o clave incorrecta");
     }

        return id;
    }
    
    public static String[] Logear(int id)
    {
        String[] datos = new String[2];
        try {
            ResultSet res = Agente.getAgente().select("SELECT ultima_conexion,nombre,apellidos FROM "
                    + "protesoft_usuarios,protesoft_voluntarios where protesoft_usuarios.id="+
                    id+" and protesoft_voluntarios.id="+id);
            datos[0] = res.getString(1);
            datos[1] = res.getString(2)+" "+res.getString(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
     }

        return datos;
    }
    
    public static void ActualizarConexion() {
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        String anyo = Integer.toString(c.get(Calendar.YEAR));
        String fecha = dia+"/"+mes+"/"+anyo;
        System.out.println(fecha);
        try {
                int rs = Agente.getAgente().insert("UPDATE protesoft_usuarios  SET "
                        + "ultima_conexion='"+fecha+"' WHERE id="+FormInicio.id);

        } catch (Exception e) {
            System.out.println(e);
     }
    }
    
}
