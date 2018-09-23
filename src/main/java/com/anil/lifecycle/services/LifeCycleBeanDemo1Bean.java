/**
 * 
 */
package com.anil.lifecycle.services;

import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
public class LifeCycleBeanDemo1Bean {

	public LifeCycleBeanDemo1Bean() {
		super();
		System.out.println("###### I'm inside LifeCycleBeanDemo1Bean constructor");
		// TODO Auto-generated constructor stub
	}

}
