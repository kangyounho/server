package com.hanbit.there.api.vo;

import java.util.List;

public class ThereVO {

	private String name;
	private String nameEn;
	private String summary;
	private String background;
	private String timezone;
	
	private List<InfoVO> areaInfo;
	private LocationVO location;
	
	
	public String getName() {
		return name;
	}
	public String getNameEn() {
		return nameEn;
	}
	public String getSummary() {
		return summary;
	}
	public String getBackground() {
		return background;
	}
	public String getTimezone() {
		return timezone;
	}
	public List<InfoVO> getAreaInfo() {
		return areaInfo;
	}
	public LocationVO getLocation() {
		return location;
	}
	public List<TrafficVO> getTraffics() {
		return traffics;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public void setAreaInfo(List<InfoVO> areaInfo) {
		this.areaInfo = areaInfo;
	}
	public void setLocation(LocationVO location) {
		this.location = location;
	}
	public void setTraffics(List<TrafficVO> traffics) {
		this.traffics = traffics;
	}
	private List<TrafficVO> traffics;
}
