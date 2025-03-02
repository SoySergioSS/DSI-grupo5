package Main;

import Interfaz.*;

public class EcoVida {

    public static void main(String args[]) {
        JFrame_Actividades frameActividades = new JFrame_Actividades();
        JFrame_Articulo frameArticulo = new JFrame_Articulo();
        JFrame_ActividadesAdministrador frameActividadesAdministrador = new JFrame_ActividadesAdministrador();
        JFrame_GenerarActividad frameGenerarActividad = new JFrame_GenerarActividad();
        JFrame_GenerarArticulo frameGenerarArticulo = new JFrame_GenerarArticulo();
        JFrame_IniciarSesion frameIniciarSesion = new JFrame_IniciarSesion();
        JFrame_InicioApp frameInicioApp = new JFrame_InicioApp();
        JFrame_MostrarArticulo frameMostrarArt = new JFrame_MostrarArticulo();
        JFrame_Perfil framePerfil = new JFrame_Perfil();
        JFrame_Principal framePrincipal = new JFrame_Principal();
        JFrame_PrincipalAdministrador framePrincipalAdministrador = new JFrame_PrincipalAdministrador();
        JFrame_Registro frameRegistro = new JFrame_Registro();
        JFrame_Tiendas frameTiendas = new JFrame_Tiendas();
        JFrame_TiendasAdministrador frameTiendasAdministrador = new JFrame_TiendasAdministrador();
        JFrame_MostrarArticulo frameMostrarArticulos = new JFrame_MostrarArticulo();
        JFrame_ActividadAsistencia frameActividadAsistencia = new JFrame_ActividadAsistencia();

        WindowManager.registerWindow("frameActividades", frameActividades);
        WindowManager.registerWindow("frameArticulo", frameArticulo);
        WindowManager.registerWindow("frameActividadesAdministrador", frameActividadesAdministrador);
        WindowManager.registerWindow("frameGenerarActividad", frameGenerarActividad);
        WindowManager.registerWindow("frameGenerarArticulo", frameGenerarArticulo);
        WindowManager.registerWindow("frameIniciarSesion", frameIniciarSesion);
        WindowManager.registerWindow("frameInicioApp", frameInicioApp);
        WindowManager.registerWindow("frameMostrarArt", frameMostrarArt);
        WindowManager.registerWindow("framePerfil", framePerfil);
        WindowManager.registerWindow("framePrincipal", framePrincipal);
        WindowManager.registerWindow("framePrincipalAdministrador", framePrincipalAdministrador);
        WindowManager.registerWindow("frameRegistro", frameRegistro);
        WindowManager.registerWindow("frameTiendas", frameTiendas);
        WindowManager.registerWindow("frameTiendasAdministrador", frameTiendasAdministrador);
        WindowManager.registerWindow("frameMostrarArticulos", frameMostrarArticulos);
        WindowManager.registerWindow("frameActividadAsistencia", frameActividadAsistencia);

        // Mostrar la ventana inicial
        WindowManager.showWindow("frameInicioApp");
    }

}