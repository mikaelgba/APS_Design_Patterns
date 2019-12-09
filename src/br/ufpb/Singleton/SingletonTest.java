package br.ufpb.Singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Singleton.getInstance().setDados("BOB", 30);
		Singleton.getInstance().setDados("BILL", 25);
	}

}
