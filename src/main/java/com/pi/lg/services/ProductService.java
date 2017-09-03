package com.pi.lg.services;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.pi.lg.dao.ProductDao;
import com.pi.lg.model.Product;

@Path("/ProductService")
public class ProductService {
	ProductDao productDao = new ProductDao();
	@GET
	@Path("/{products}")
	public String getProductList(){
		return new Gson().toJson(productDao.getProductList()).toString();
	}
}
