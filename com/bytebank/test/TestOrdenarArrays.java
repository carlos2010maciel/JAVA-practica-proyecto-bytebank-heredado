package com.bytebank.test;

import java.util.Arrays;

public class TestOrdenarArrays {

	public static void main(String[] args) {
		int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros); //método utilitario sort

        System.out.println(Arrays.toString(numeros)); //método utilitario toString

        //Salida : [15, 22, 43, 64, 89]
	}

}
