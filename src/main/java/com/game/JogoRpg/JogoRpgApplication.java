package com.game.JogoRpg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.game.JogoRpg.controller.*;
@SpringBootApplication
public class JogoRpgApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JogoRpgApplication.class, args);
		CreatePersonagem createPersonagem = new CreatePersonagem();
		createPersonagem.criarPersonagem();

		//Combate combate = new Combate();
		//combate.exibeMenu();
		//combate.combate();

	}

}
