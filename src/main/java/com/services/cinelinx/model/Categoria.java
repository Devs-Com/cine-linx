package com.services.cinelinx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Categoria {
	@Id
	@Column(name = "idcategoria")
	private Integer id;
	private String nombre;
}
