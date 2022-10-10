package com.qa.java.Exceptions;

public class Util  {


	

	public static  int div (int no1 , int no2 ) {
		return no1/no2;
	}
	
	
	
	
	
	
	public static Product getProductById(int id) throws ProductNotFoundExeption {
	
		Product noProduct = null;
		
		if (noProduct == null) {
			throw new ProductNotFoundExeption("no product with such ID");
		}

		return noProduct;
	};


	public static void  getProductDetails(Product product) {
		
		try { 
			
			product.getInformation();
			
		} catch ( NullPointerException e) {
			
			System.out.println("Product is Null");
			
			
		}
		
	}

}
