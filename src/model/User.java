package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="id")
 protected int id;
 
 @Column(name="userName")
 protected String userName;
 
@Column(name="email")
 protected String email;
 
 @Column(name="password")
 protected String password;
 
 public User() {
 }
 
 public User(String userName, String email, String password) {
  super();
  this.userName = userName;
  this.email = email;
  this.password = password;
 }

 public User(int id, String userName, String email, String password) {
  super();
  this.id = id;
  this.userName = userName;
  this.email = email;
  this.password = password;
 }

 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
