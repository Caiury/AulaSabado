package MegaSena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Capitulo13.megaSenaUtilitario;

class SorteioDoNumero {

	@Test
	void gerarNumeroPositivo() {
   int  numero = megaSenaUtilitario.sortearNumero();
      assertTrue(numero >0);
	}

	@Test
	void gerarNumeroMenorIgualSessenta() {
     int numero = megaSenaUtilitario.sortearNumero();
     assertTrue(numero <=60);
	}
}
