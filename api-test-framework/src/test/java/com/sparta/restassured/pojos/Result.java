package com.sparta.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result{

	@JsonProperty("nhs_region")
	private String nhsRegion;

	@JsonProperty("country")
	private String country;

	@JsonProperty("codes")
	private Codes codes;

	@JsonProperty("ruc21")
	private String ruc21;

	@JsonProperty("senedd_constituency_no")
	private Object seneddConstituencyNo;

	@JsonProperty("ced")
	private Object ced;

	@JsonProperty("parliamentary_constituency_2024")
	private String parliamentaryConstituency2024;

	@JsonProperty("ccg")
	private String ccg;

	@JsonProperty("latitude")
	private Object latitude;

	@JsonProperty("lep1")
	private String lep1;

	@JsonProperty("icb")
	private String icb;

	@JsonProperty("lep2")
	private Object lep2;

	@JsonProperty("admin_county")
	private Object adminCounty;

	@JsonProperty("msoa")
	private String msoa;

	@JsonProperty("lsoa21")
	private String lsoa21;

	@JsonProperty("msoa11")
	private String msoa11;

	@JsonProperty("primary_care_trust")
	private String primaryCareTrust;

	@JsonProperty("parish")
	private String parish;

	@JsonProperty("national_park")
	private String nationalPark;

	@JsonProperty("nhs_ha")
	private String nhsHa;

	@JsonProperty("date_of_introduction")
	private String dateOfIntroduction;

	@JsonProperty("ruc11")
	private String ruc11;

	@JsonProperty("longitude")
	private Object longitude;

	@JsonProperty("oa21")
	private String oa21;

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("european_electoral_region")
	private String europeanElectoralRegion;

	@JsonProperty("parliamentary_constituency")
	private String parliamentaryConstituency;

	@JsonProperty("admin_ward")
	private String adminWard;

	@JsonProperty("eastings")
	private int eastings;

	@JsonProperty("pfa")
	private String pfa;

	@JsonProperty("lsoa11")
	private String lsoa11;

	@JsonProperty("lsoa")
	private String lsoa;

	@JsonProperty("admin_district")
	private String adminDistrict;

	@JsonProperty("quality")
	private int quality;

	@JsonProperty("bua")
	private String bua;

	@JsonProperty("nuts")
	private String nuts;

	@JsonProperty("outcode")
	private String outcode;

	@JsonProperty("senedd_constituency")
	private Object seneddConstituency;

	@JsonProperty("northings")
	private int northings;

	@JsonProperty("incode")
	private String incode;

	@JsonProperty("date_of_termination")
	private Object dateOfTermination;

	@JsonProperty("region")
	private String region;

	@JsonProperty("index_of_multiple_deprivation")
	private int indexOfMultipleDeprivation;

	@JsonProperty("ttwa")
	private String ttwa;

	@JsonProperty("cancer_alliance")
	private String cancerAlliance;

	@JsonProperty("msoa21")
	private String msoa21;

	public String getNhsRegion(){
		return nhsRegion;
	}

	public String getCountry(){
		return country;
	}

	public Codes getCodes(){
		return codes;
	}

	public String getRuc21(){
		return ruc21;
	}

	public Object getSeneddConstituencyNo(){
		return seneddConstituencyNo;
	}

	public Object getCed(){
		return ced;
	}

	public String getParliamentaryConstituency2024(){
		return parliamentaryConstituency2024;
	}

	public String getCcg(){
		return ccg;
	}

	public Object getLatitude(){
		return latitude;
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

	public Object getAdminCounty(){
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

	public String getPrimaryCareTrust(){
		return primaryCareTrust;
	}

	public String getParish(){
		return parish;
	}

	public String getNationalPark(){
		return nationalPark;
	}

	public String getNhsHa(){
		return nhsHa;
	}

	public String getDateOfIntroduction(){
		return dateOfIntroduction;
	}

	public String getRuc11(){
		return ruc11;
	}

	public Object getLongitude(){
		return longitude;
	}

	public String getOa21(){
		return oa21;
	}

	public String getPostcode(){
		return postcode;
	}

	public String getEuropeanElectoralRegion(){
		return europeanElectoralRegion;
	}

	public String getParliamentaryConstituency(){
		return parliamentaryConstituency;
	}

	public String getAdminWard(){
		return adminWard;
	}

	public int getEastings(){
		return eastings;
	}

	public String getPfa(){
		return pfa;
	}

	public String getLsoa11(){
		return lsoa11;
	}

	public String getLsoa(){
		return lsoa;
	}

	public String getAdminDistrict(){
		return adminDistrict;
	}

	public int getQuality(){
		return quality;
	}

	public String getBua(){
		return bua;
	}

	public String getNuts(){
		return nuts;
	}

	public String getOutcode(){
		return outcode;
	}

	public Object getSeneddConstituency(){
		return seneddConstituency;
	}

	public int getNorthings(){
		return northings;
	}

	public String getIncode(){
		return incode;
	}

	public Object getDateOfTermination(){
		return dateOfTermination;
	}

	public String getRegion(){
		return region;
	}

	public int getIndexOfMultipleDeprivation(){
		return indexOfMultipleDeprivation;
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