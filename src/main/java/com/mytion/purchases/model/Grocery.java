package com.mytion.purchases.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Grocery {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private float amount;
	private int quantityProducts;
}
