package com.test.maven.study;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumStudy {
	
	public static void main(String[] args) {
		// enumMap
		Map<CityList, Integer> enumMap = new EnumMap<CityList, Integer>(CityList.class);
		calcGetPerformance(enumMap);
		
		// hashMap
		Map<CityList, Integer> hashMap = new HashMap<CityList, Integer>();
		calcGetPerformance(hashMap);
		
		// 값확인
		for (CityList city : CityList.values()) {
			System.out.println("도시명 : " + city + ", 도시번호 : " + city.getCitiNumber());
		}
	}


	private static void calcGetPerformance(Map<CityList, Integer> enumMap) {
		long[] testCaseWorkTime = new long[10];
		
		for (int i = 0; i < testCaseWorkTime.length; i++) {
			long startTime = System.nanoTime();
			for (int j = 0; j < 10000000; j++) {
				enumMap.get(CityList.ALLCITY);
			}
			long endTime = System.nanoTime();
			testCaseWorkTime[i] = endTime - startTime;
		}
		
		long sum = 0;
		for (final long workTime : testCaseWorkTime) {
			sum += workTime;
			
			if (sum < 0) {
				System.out.println("---error---" + sum);
			}
		}
		
		System.out.println("데이터 가져오기 10회평균실행시간 : " +sum / testCaseWorkTime.length);
		
	}
}
