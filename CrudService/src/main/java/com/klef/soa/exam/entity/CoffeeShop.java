package com.klef.soa.exam.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "coffeeshop")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeShop 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String shopname;

	    @Column(nullable = false)
	    private String location;

	    @Column(nullable = false)
	    private double averageprice;

	    @Column(nullable = false)
	    private boolean open;

	
	

}
