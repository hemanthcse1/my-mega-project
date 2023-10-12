package com.hemanth.reactivemongodb.util;

import com.hemanth.reactivemongodb.dto.ProductDto;
import com.hemanth.reactivemongodb.entity.Product;
import org.springframework.beans.BeanUtils;

public class ProductUtils {


    public static ProductDto entityToDTO(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
