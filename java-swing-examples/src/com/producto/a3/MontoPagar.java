package com.producto.a3;

import java.util.HashMap;

public class MontoPagar {

    public Monto calcular(String ciclo, String curso) {
        int cicloValor = MontoAyudante.obtenerValorPorCiclo(ciclo);
        
        HashMap<String, Monto> valores = MontoAyudante.obtenerPreciosPorCiclo(cicloValor);
        Monto monto = valores.get(curso);
        monto.setCiclo(ciclo);
        monto.setTotal(monto.getCosto() * monto.getCreditos());

        return monto;
    }

}
