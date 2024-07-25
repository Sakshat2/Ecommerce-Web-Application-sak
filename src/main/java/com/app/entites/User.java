package com.app.entites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
	
	
	

	public User(Long userId,
			@Size(min = 5, max = 20, message = "First Name must be between 5 and 30 characters long") @Pattern(regexp = "^[a-zA-Z]*$", message = "First Name must not contain numbers or special characters") String firstName,
			@Size(min = 5, max = 20, message = "Last Name must be between 5 and 30 characters long") @Pattern(regexp = "^[a-zA-Z]*$", message = "Last Name must not contain numbers or special characters") String lastName,
			@Size(min = 10, max = 10, message = "Mobile Number must be exactly 10 digits long") @Pattern(regexp = "^\\d{10}$", message = "Mobile Number must contain only Numbers") String mobileNumber,
			@Email String email, String password, Set<Role> roles, List<Address> addresses, Cart cart) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.addresses = addresses;
		this.cart = cart;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Size(min = 5, max = 20, message = "First Name must be between 5 and 30 characters long")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "First Name must not contain numbers or special characters")
	private String firstName;

	@Size(min = 5, max = 20, message = "Last Name must be between 5 and 30 characters long")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Last Name must not contain numbers or special characters")
	private String lastName;

	@Size(min = 10, max = 10, message = "Mobile Number must be exactly 10 digits long")
	@Pattern(regexp = "^\\d{10}$", message = "Mobile Number must contain only Numbers")
	private String mobileNumber;

	@Email
	@Column(unique = true, nullable = false)
	private String email;

	private String password;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "address_id"))
	private List<Address> addresses = new ArrayList<>();

	@OneToOne(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval = true)
	private Cart cart;
	
	
	

	

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", password=" + password + ", roles=" + roles + ", addresses="
				+ addresses + ", cart=" + cart + "]";
	}
	
	
	

}
