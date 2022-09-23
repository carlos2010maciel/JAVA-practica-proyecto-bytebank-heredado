package com.bytebank.test;

import com.bytebank.modelo.CalculadoraDeImpuesto;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.SeguroDeVida;

public class TestTributacion {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImpuesto());
    }

}
