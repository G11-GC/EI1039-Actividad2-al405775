package cajas_te;
import caja.Caja;
import decorador.NotificacionDecorator;

public abstract class Caja_de_te implements Caja {
    protected Integer num_sobres;
    protected String msg;
    private NotificacionDecorator notificador;

    public Integer cuentaSobres(){
        return num_sobres;
    }
    public void setNotificador(NotificacionDecorator notificador) {
        this.notificador = notificador;
    }
    public void notifica(){
        if(notificador != null){
            notificador.notifica(msg);
            return;
        }
        System.out.println(msg);
    }
}
