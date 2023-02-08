package modeles;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {
    @Id
    String code;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
