package ca.irvine.cinema_inner_world.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @Column(columnDefinition = "VARCHAR2(20)", insertable = false, updatable = false, nullable = false)
    private String category;

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
}