package com.start.products;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by nikola.kaloyanov on 12/23/2015.
 */
@Entity
public class Product
{
	@Id
	@GeneratedValue
	private long id;

	@NotEmpty
	private String name;

	private String description;

	public Product()
	{
	}

	public Product(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
