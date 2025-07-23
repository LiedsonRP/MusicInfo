package br.com.alura.musicinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.musicinfo.principal.Principal;
import br.com.alura.musicinfo.repository.ArtistaRepository;

@SpringBootApplication
public class MusicinfoApplication implements CommandLineRunner{

	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(MusicinfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
		
	}

}
