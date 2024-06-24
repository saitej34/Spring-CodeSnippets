package com.practice.demo.businessdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
@Primary
public class MYSQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}

}
