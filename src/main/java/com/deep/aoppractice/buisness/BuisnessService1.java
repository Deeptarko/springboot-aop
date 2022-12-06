package com.deep.aoppractice.buisness;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.deep.aoppractice.data.DataService1;

@Service
public class BuisnessService1 {

	private DataService1 dataService1;

	public  BuisnessService1(DataService1 dataService1) {
		this.dataService1 = dataService1;
	}

	public int calculateMax() {
		int[] data = dataService1.retrieveData();

		return Arrays.stream(data).max().orElse(0);
	}

}
