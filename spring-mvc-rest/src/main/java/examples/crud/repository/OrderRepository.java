package examples.crud.repository;

import examples.crud.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by serhii on 06.11.14.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

    public Order findByOrderNumber(String orderNumber);
}