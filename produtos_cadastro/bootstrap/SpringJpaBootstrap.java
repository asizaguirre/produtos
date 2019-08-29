package com.produtos.cadastro.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.produtos.cadastro.domain.Product;
import com.produtos.cadastro.repositories.ProductRepository;

import java.math.BigDecimal;

@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private ProductRepository productRepository;

	private Logger log = LogManager.getLogger(SpringJpaBootstrap.class);

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		loadProducts();
	}

	private void loadProducts() {
		Product a = new Product();
		a.setIdCategorias(1);
		a.setPreco(new BigDecimal("8.95"));
		a.setFoto("");
		a.setIdCategorias(235268845);
		productRepository.save(a);

		log.info("Saved a - id: " + a.getId());

		Product b = new Product();
		b.setFoto("");
		b.setId(1686393934);
		b.setPreco(new BigDecimal("1.46"));
		productRepository.save(b);

		log.info("Saved b - id:" + b.getId());
	}

}
