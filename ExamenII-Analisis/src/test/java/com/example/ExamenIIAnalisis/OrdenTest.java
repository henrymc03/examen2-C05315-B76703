package com.example.ExamenIIAnalisis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrdenTest {

    @Test
    public void total_venta_igual_contenido_de_orden(){

        Cliente cliente = new Cliente(1,"Milena", "Rojas Leiva");
        Date date = new Date();

        Producto pH = new ProductoHardware(1,"CPU", 500000.0f, "Intel");
        Producto pS = new ProductoSoftware(1,"Intellij", 250000.0f, "17.0");

        ItemOrden itemOrden1 = new ItemOrden(1,1, pH.getPrecio(), pH);
        ItemOrden itemOrden2 = new ItemOrden(1,1, pS.getPrecio(), pS);

        List<ItemOrden> itemOrdenList = new ArrayList<ItemOrden>();
        itemOrdenList.add(itemOrden1);
        itemOrdenList.add(itemOrden2);

        Orden orden = new Orden(1,date, cliente, itemOrdenList);

        int result = 0;

        for(int i=0; i<orden.getItemes().size(); i++){
            result+=orden.getItemes().get(i).getProducto().getPrecio();
        }

        assertTrue(result==750000.0f);
    }
}
