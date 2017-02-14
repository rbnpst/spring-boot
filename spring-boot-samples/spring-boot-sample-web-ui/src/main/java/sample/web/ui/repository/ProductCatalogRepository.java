package sample.web.ui.repository;

import org.springframework.data.repository.CrudRepository;
import sample.web.ui.model.ProductCatalog;

/**
 * Created by Robin on 14-2-2017.
 */
public interface ProductCatalogRepository extends CrudRepository<ProductCatalog, Long> {
}
