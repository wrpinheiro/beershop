package com.thecodeinside.beershop.repository;

import com.thecodeinside.beershop.models.Style;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository for style model
 *
 * @author Wellington Pinheiro <wellington.pinheiro@gmail.com>
 */
public interface StyleRepository extends CrudRepository<Style, Long> {
}
