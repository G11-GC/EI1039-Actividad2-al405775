package decorador;

import caja.Caja;

public class NotificacionCorreo implements NotificacionDecorator{
    private Caja caja;

    @Override
    public void notifica(String msg) {
        System.out.println("Simulo envío por correo del mensaje:" + msg);
    }
}
