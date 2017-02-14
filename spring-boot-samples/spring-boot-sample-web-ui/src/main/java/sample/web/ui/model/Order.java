package sample.web.ui.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 14-2-2017.
 */
@Entity
@Table(name="Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = javax.persistence.CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

}
