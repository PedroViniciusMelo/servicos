package org.ufape.catalogo.basica;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	private String icone;
	
	@ManyToOne
	private Categoria categoriaPai;
}
