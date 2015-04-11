package com.happy.hack.hibernate.entity;



// Generated 11 Apr, 2015 5:10:44 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RawTable generated by hbm2java
 */
@Entity
@Table(name = "RawTable", catalog = "Happyhack")
public class RawTable implements java.io.Serializable {

	private Integer idRawTable;
	private Double avgPrice;
	private Float overallRating;
	private String url;
	private String author;
	private String content;
	private String date;
	private String imgSrc;
	private Integer noReader;
	private Integer noHelpful;
	private Integer overall;
	private Integer value;
	private Integer rooms;
	private Integer locations;
	private Integer cleanliness;
	private Integer chekIn;
	private Integer service;
	private Integer businessService;

	public RawTable() {
	}

	public RawTable(Double avgPrice, Float overallRating, String url,
			String author, String content, String date, String imgSrc,
			Integer noReader, Integer noHelpful, Integer overall,
			Integer value, Integer rooms, Integer locations,
			Integer cleanliness, Integer chekIn, Integer service,
			Integer businessService) {
		this.avgPrice = avgPrice;
		this.overallRating = overallRating;
		this.url = url;
		this.author = author;
		this.content = content;
		this.date = date;
		this.imgSrc = imgSrc;
		this.noReader = noReader;
		this.noHelpful = noHelpful;
		this.overall = overall;
		this.value = value;
		this.rooms = rooms;
		this.locations = locations;
		this.cleanliness = cleanliness;
		this.chekIn = chekIn;
		this.service = service;
		this.businessService = businessService;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRawTable", unique = true, nullable = false)
	public Integer getIdRawTable() {
		return this.idRawTable;
	}

	public void setIdRawTable(Integer idRawTable) {
		this.idRawTable = idRawTable;
	}

	@Column(name = "Avg_Price", precision = 22, scale = 0)
	public Double getAvgPrice() {
		return this.avgPrice;
	}

	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	@Column(name = "Overall_Rating", precision = 12, scale = 0)
	public Float getOverallRating() {
		return this.overallRating;
	}

	public void setOverallRating(Float overallRating) {
		this.overallRating = overallRating;
	}

	@Column(name = "URL", length = 45)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "Author", length = 100)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "Content", length = 10000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "Date", length = 45)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "img_src", length = 45)
	public String getImgSrc() {
		return this.imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Column(name = "No_Reader")
	public Integer getNoReader() {
		return this.noReader;
	}

	public void setNoReader(Integer noReader) {
		this.noReader = noReader;
	}

	@Column(name = "No_helpful")
	public Integer getNoHelpful() {
		return this.noHelpful;
	}

	public void setNoHelpful(Integer noHelpful) {
		this.noHelpful = noHelpful;
	}

	@Column(name = "Overall")
	public Integer getOverall() {
		return this.overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	@Column(name = "Value")
	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Column(name = "Rooms")
	public Integer getRooms() {
		return this.rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	@Column(name = "Locations")
	public Integer getLocations() {
		return this.locations;
	}

	public void setLocations(Integer locations) {
		this.locations = locations;
	}

	@Column(name = "Cleanliness")
	public Integer getCleanliness() {
		return this.cleanliness;
	}

	public void setCleanliness(Integer cleanliness) {
		this.cleanliness = cleanliness;
	}

	@Column(name = "ChekIn")
	public Integer getChekIn() {
		return this.chekIn;
	}

	public void setChekIn(Integer chekIn) {
		this.chekIn = chekIn;
	}

	@Column(name = "Service")
	public Integer getService() {
		return this.service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	@Column(name = "BusinessService")
	public Integer getBusinessService() {
		return this.businessService;
	}

	public void setBusinessService(Integer businessService) {
		this.businessService = businessService;
	}

}