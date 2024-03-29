package jbr.webshop.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "login")
public class LoginModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private Long userid;

  private String username;

  private String password;

  @Transient
  private LocalDateTime lastlogin;
}
