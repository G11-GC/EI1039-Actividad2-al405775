package caja_grande;
import caja.Caja;
import decorador.NotificacionDecorator;

import java.util.ArrayList;
import java.util.List;

public class Caja_grande implements Caja {
    private String msg = "Añado una caja grande";
    private NotificacionDecorator notificador;
    public Caja_grande(){
        notifica();
    }
    public void setNotificador(NotificacionDecorator notificador) {
        this.notificador = notificador;
    }
    public void notifica(){
        if (notificador!=null){
            notificador.notifica(msg);
        }
        System.out.println(msg);
    }
    List<Caja> children = new ArrayList<>();
    public void add(Caja caja_nueva){
        children.add(caja_nueva);
    }
    public void remove(Caja caja_vieja){
        children.remove(caja_vieja);
    }
    public void removeLast(){
        children.remove(-1);
    }

    public Integer cuentaSobres() {
        int count = 0;
        for(Caja caja:children){
            count= count + caja.cuentaSobres();
        }
        System.out.println("Este paquete consta de " + count + " unidades");
        return count;
    }
}
