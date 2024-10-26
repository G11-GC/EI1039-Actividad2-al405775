package cajas_te;

import decorador.NotificacionDecorator;

public class Te_verde extends Caja_de_te {
    public Te_verde(){
        msg = "Añado una caja de té verde";
        num_sobres=24;
        notifica();
    }
    public Te_verde(NotificacionDecorator not){
        msg = "Añado una caja de té verde";
        num_sobres=24;
        setNotificador(not);
        notifica();
    }
}
