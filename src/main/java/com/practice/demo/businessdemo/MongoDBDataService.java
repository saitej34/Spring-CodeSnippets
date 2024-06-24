package com.practice.demo.businessdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MongoDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {10,20,30,40,50};
	}

}
