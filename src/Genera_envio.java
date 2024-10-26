import caja.Caja;
import caja_grande.Caja_grande;
import cajas_te.Caja_de_te;
import cajas_te.Te_blanco;
import cajas_te.Te_verde;
import decorador.NotificacionCorreo;
import decorador.NotificacionTexto;

public class Genera_envio {
    public static void main(String[] args) {
        //cliente 1
        Caja_grande paquete1 = new Caja_grande();
        for(int i = 0; i<2;i++){
            paquete1.add(new Te_blanco());
        }
        Caja_de_te nuevo = new Te_verde(new NotificacionCorreo());
        paquete1.add(nuevo);
        paquete1.cuentaSobres();
        //cliente 2
        Caja_grande paquete2 = new Caja_grande();
        for(int i = 0; i<2;i++){
            paquete2.add(new Te_verde());
        }
        paquete2.add(new Te_blanco(new NotificacionTexto()));
        paquete2.cuentaSobres();
        //combinar
        Caja_grande paqueteFinal = new Caja_grande();
        paqueteFinal.add(paquete1);
        paqueteFinal.add(paquete2);
        paqueteFinal.cuentaSobres();
    }
}