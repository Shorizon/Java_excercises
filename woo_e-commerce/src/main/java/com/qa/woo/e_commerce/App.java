package com.qa.woo.e_commerce;

import com.qa.woo.e_commerce.repository.Repository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Repository rep = new Repository();
    	rep.getDbConnection();
    }
}
