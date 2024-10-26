package cajas_te;

import decorador.NotificacionDecorator;

public class Te_blanco extends Caja_de_te {
    public Te_blanco(){
        msg = "Añado una caja de té blanco";
        num_sobres=60;
        notifica();
    }
    public Te_blanco(NotificacionDecorator not){
        msg = "Añado una caja de té blanco";
        num_sobres=60;
        setNotificador(not);
        notifica();
    }

}
