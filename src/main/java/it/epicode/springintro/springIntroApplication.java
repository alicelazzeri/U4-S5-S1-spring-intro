package it.epicode.springintro;

import it.epicode.springintro.entities.AppConfig;
import it.epicode.springintro.entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class springIntroApplication {

	public static void main(String[] args) {

		SpringApplication.run(springIntroApplication.class, args);

// Esercizio 13/5
//		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
//			Menu menu = (Menu) ctx.getBean(Menu.class);
//			menu.viewMenu();
//		} catch (BeansException e) {
//			log.error("Error while printing the menu", e);
//		}

	}

}
