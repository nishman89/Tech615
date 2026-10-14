package com.sparta.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Codes{

	@JsonProperty("ccg_id")
	private String ccgId;

	@JsonProperty("nhs_region")
	private String nhsRegion;

	@JsonProperty("ruc21")
	private String ruc21;

	@JsonProperty("ced")
	private String ced;

	@JsonProperty("parliamentary_constituency_2024")
	private String parliamentaryConstituency2024;

	@JsonProperty("ccg")
	private String ccg;

	@JsonProperty("lep1")
	private String lep1;

	@JsonProperty("icb")
	private String icb;

	@JsonProperty("lep2")
	private Object lep2;

	@JsonProperty("admin_county")
	private String adminCounty;

	@JsonProperty("msoa")
	private String msoa;

	@JsonProperty("lsoa21")
	private String lsoa21;

	@JsonProperty("msoa11")
	private String msoa11;

	@JsonProperty("parish")
	private String parish;

	@JsonProperty("national_park")
	private String nationalPark;

	@JsonProperty("ruc11")
	private String ruc11;

	@JsonProperty("lau2")
	private String lau2;

	@JsonProperty("oa21")
	private String oa21;

	@JsonProperty("admin_ward")
	private String adminWard;

	@JsonProperty("parliamentary_constituency")
	private String parliamentaryConstituency;

	@JsonProperty("pfa")
	private String pfa;

	@JsonProperty("lsoa11")
	private String lsoa11;

	@JsonProperty("admin_district")
	private String adminDistrict;

	@JsonProperty("lsoa")
	private String lsoa;

	@JsonProperty("bua")
	private String bua;

	@JsonProperty("nuts")
	private String nuts;

	@JsonProperty("ttwa")
	private String ttwa;

	@JsonProperty("cancer_alliance")
	private String cancerAlliance;

	@JsonProperty("msoa21")
	private String msoa21;

	public String getCcgId(){
		return ccgId;
	}

	public String getNhsRegion(){
		return nhsRegion;
	}

	public String getRuc21(){
		return ruc21;
	}

	public String getCed(){
		return ced;
	}

	public String getParliamentaryConstituency2024(){
		return parliamentaryConstituency2024;
	}

	public String getCcg(){
		return ccg;
	}

	public String getLep1(){
		return lep1;
	}

	public String getIcb(){
		return icb;
	}

	public Object getLep2(){
		return lep2;
	}

	public String getAdminCounty(){
		return adminCounty;
	}

	public String getMsoa(){
		return msoa;
	}

	public String getLsoa21(){
		return lsoa21;
	}

	public String getMsoa11(){
		return msoa11;
	}

	public String getParish(){
		return parish;
	}

	public String getNationalPark(){
		return nationalPark;
	}

	public String getRuc11(){
		return ruc11;
	}

	public String getLau2(){
		return lau2;
	}

	public String getOa21(){
		return oa21;
	}

	public String getAdminWard(){
		return adminWard;
	}

	public String getParliamentaryConstituency(){
		return parliamentaryConstituency;
	}

	public String getPfa(){
		return pfa;
	}

	public String getLsoa11(){
		return lsoa11;
	}

	public String getAdminDistrict(){
		return adminDistrict;
	}

	public String getLsoa(){
		return lsoa;
	}

	public String getBua(){
		return bua;
	}

	public String getNuts(){
		return nuts;
	}

	public String getTtwa(){
		return ttwa;
	}

	public String getCancerAlliance(){
		return cancerAlliance;
	}

	public String getMsoa21(){
		return msoa21;
	}
}