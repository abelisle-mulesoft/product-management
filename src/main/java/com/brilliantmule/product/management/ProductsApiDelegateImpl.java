package com.brilliantmule.product.management;

import com.brilliantmule.product.management.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsApiDelegateImpl implements ProductsApiDelegate {

    /**
     * POST /products : Create products
     *
     * @param product Products to create (optional)
     * @return Products created successfully (status code 201)
     * @see ProductsApi#createProducts
     */
    @Override
    public ResponseEntity<Void> createProducts(List<Product> product) {
        if (product == null || product.isEmpty()) {
            System.out.println("Request is null or empty");
        } else {
            System.out.println("Request contains " + product.size() + " products");
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
