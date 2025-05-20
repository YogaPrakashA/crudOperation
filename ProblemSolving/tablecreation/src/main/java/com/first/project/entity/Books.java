package com.first.project.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;

	private String firstName;

	private String lastName;

	private Date birthDay;

	@OneToOne
	@JoinColumn(name = "genresId", referencedColumnName = "genresId")
	private Genres genresId;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Genres getGenresId() {
		return genresId;
	}

	public void setGenresId(Genres genresId) {
		this.genresId = genresId;
	}

}
