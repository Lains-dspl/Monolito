package com.monolito.models;

public class City {
	private int id;
	private double cityCode;
	private String cityName;
	private int departmentId;

	/**
	 * 
	 */
	public City() {
		super();
	}

	/**
	 * @param id
	 * @param cityCode
	 * @param cityName
	 * @param departmentId
	 */
	public City(int id, double cityCode, String cityName, int departmentId) {
		super();
		this.id = id;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.departmentId = departmentId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cityCode
	 */
	public double getCityCode() {
		return cityCode;
	}

	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(double cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
