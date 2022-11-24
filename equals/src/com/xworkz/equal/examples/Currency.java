package com.xworkz.equal.examples;
public class Currency {
	private String currencyName;
	private String countryName;
	private double makingCost;
	private char code;
	private boolean strong;
	private double convertingPrice;
	private String material;
	private String acceptableCountries;
	private String colour;
	private int value;

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getMakingCost() {
		return makingCost;
	}

	public void setMakingCost(double makingCost) {
		this.makingCost = makingCost;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public boolean isStrong() {
		return strong;
	}

	public void setStrong(boolean strong) {
		this.strong = strong;
	}

	public double getConvertingPrice() {
		return convertingPrice;
	}

	public void setConvertingPrice(double convertingPrice) {
		this.convertingPrice = convertingPrice;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAcceptableCountries() {
		return acceptableCountries;
	}

	public void setAcceptableCountries(String acceptableCountries) {
		this.acceptableCountries = acceptableCountries;
	}
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Currency() {
		// TODO Auto-generated constructor stub
	}

	public Currency(String currencyName, String countryName, double makingCost, char code, boolean strong,
			double convertingPrice, String material, String acceptableCountries) {
		super();
		this.currencyName = currencyName;
		this.countryName = countryName;
		this.makingCost = makingCost;
		this.code = code;
		this.strong = strong;
		this.convertingPrice = convertingPrice;
		this.material = material;
		this.acceptableCountries = acceptableCountries;
	
		
	}

	@Override
	public String toString() {
		return "Currency [currencyName=" + currencyName + ", countryName=" + countryName + ", makingCost=" + makingCost
				+ ", code=" + code + ", strong=" + strong + ", convertingPrice=" + convertingPrice + ", material="
				+ material + ", acceptableCountries=" + acceptableCountries + ", colour=" + colour + ", value=" + value
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in currencye");

		if (obj instanceof Currency) {
			System.out.println("obj is currency, can check the properties");
			Currency casting = (Currency) obj;
			if (this.currencyName.equals(casting.currencyName)) {
				System.out.println("currencyName is same");
				return true;
			} else {
				System.err.println("obj is not currency, cannot check the properties");
			}

		}
		return false;
	}


	

}