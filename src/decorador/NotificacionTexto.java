package decorador;

import caja.Caja;

public class NotificacionTexto implements NotificacionDecorator{
    private Caja caja;
    @Override
    public void notifica(String msg) {
        System.out.println("Envío por texto del mensaje: "+ msg);
    }
}
