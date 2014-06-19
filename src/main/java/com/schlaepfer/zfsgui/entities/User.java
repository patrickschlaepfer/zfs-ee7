package com.schlaepfer.zfsgui.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
})
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @NotNull
    private Integer id;
	
	@NotNull
    @Size(min = 1, max = 50)
    private String name;
	
	public User() {}
	
	public User(Integer id) {
		this.id = id;
	}
	
	public User(Integer id, String name){
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
