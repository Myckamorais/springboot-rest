package com.springboot.rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/** Teste de fumaça: falha se o contexto do Spring não conseguir subir. */
@SpringBootTest
class RestApplicationTests {

	/** Vazio de propósito; o simples carregamento do contexto já é o teste. */
	@Test
	void contextLoads() {
	}

}