package com.game.JogoRpg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.game.JogoRpg.controller.Combate;
@SpringBootApplication
public class JogoRpgApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JogoRpgApplication.class, args);
		Combate combate = new Combate();
		combate.exibeMenu();
		combate.combate();
	}

}
