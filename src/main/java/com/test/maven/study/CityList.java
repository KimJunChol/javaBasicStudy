package com.test.maven.study;

public enum CityList {
	ALLCITY(0), SEOUL(1), GYEONGGI(2), DAEGU(3), INCHEON(4);
	
	// enum사용시 값 초기화
	private int citiNumber;

	/**
	 * @param citiNumber
	 */
	private CityList(int citiNumber) {
		this.citiNumber = citiNumber;
	}

	// enum 개별항목의 value 가져오기
	public int getCitiNumber() {
		return citiNumber;
	}

}
