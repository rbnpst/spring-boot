package sample.web.ui.repository;

import org.springframework.data.repository.CrudRepository;
import sample.web.ui.model.Order;

/**
 * Created by Robin on 14-2-2017.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
