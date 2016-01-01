package dominio;

import java.sql.ResultSet;
import persistencia.Agente;

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
    
}
