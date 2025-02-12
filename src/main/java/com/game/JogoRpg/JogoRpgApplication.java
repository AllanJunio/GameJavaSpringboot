package com.game.JogoRpg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.game.JogoRpg.controller.Acoes;
@SpringBootApplication
public class JogoRpgApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JogoRpgApplication.class, args);
		Acoes acoes = new Acoes();
		acoes.exibeMenu();
	}

}
