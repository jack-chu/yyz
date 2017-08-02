package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;

@Entity
public class Account {

  @OneToMany(mappedBy = "account")
  private Set<Bookmark> bookmarks = new HashSet<>();

  @Id
  @GeneratedValue
  private long id;

  public Set<Bookmark> getBookmarks() {
    return bookmarks;
  }

  public long getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public String getUsername() {
    return username;
  }

  @JsonIgnore
  public String password;
  public String username;

  public Account(String password, String username) {
    this.password = password;
    this.username = username;
  }

  public Account() { // jpa only
  }
}
