package com.cts.dao;

import com.cts.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductDaoImpl implements ProductDao {
    private JdbcTemplate template;

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Product getProductDetails(final int product_code) {
        String sql = "select * from product where product_code = " + product_code;
        return template.queryForObject(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {
                int productCode = resultSet.getInt(1);
                String productName = resultSet.getString(2);
                String productCategory = resultSet.getString(3);
                String productDesc = resultSet.getString(4);
                double productPrice = resultSet.getDouble(5);

                return new Product(productCode, productName, productCategory, productDesc, productPrice);
            }
        });
    }
}
