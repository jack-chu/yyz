package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Bookmark {

  @JsonIgnore
  @ManyToOne
  private Account account;

  @Id
  @GeneratedValue
  private long id;

  public Bookmark() {
  }

  public Bookmark(Account account, String uri, String description) {
    this.account = account;
    this.uri = uri;
    this.description = description;
  }

  public String uri;
  public String description;

  public Account getAccount() {
    return account;
  }

  public long getId() {
    return id;
  }

  public String getUri() {
    return uri;
  }

  public String getDescription() {
    return description;
  }
}