package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 产地实体
 * @author huhong
 *
 */
public class Goodsarea implements java.io.Serializable {

	// Fields

	private Integer areaId; // 产地id
	private String areaName; // 产地名称
	private String areaLocation; // 产地具体地址
	private String areaStat; // 产地描述
	private Set goodsinfos = new HashSet(0); // 商品信息集合

	// Constructors

	/** default constructor */
	public Goodsarea() {
	}

	/** full constructor */
	public Goodsarea(String areaName, String areaLocation, String areaStat,
			Set goodsinfos) {
		this.areaName = areaName;
		this.areaLocation = areaLocation;
		this.areaStat = areaStat;
		this.goodsinfos = goodsinfos;
	}

	// Property accessors

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaLocation() {
		return this.areaLocation;
	}

	public void setAreaLocation(String areaLocation) {
		this.areaLocation = areaLocation;
	}

	public String getAreaStat() {
		return this.areaStat;
	}

	public void setAreaStat(String areaStat) {
		this.areaStat = areaStat;
	}

	public Set getGoodsinfos() {
		return this.goodsinfos;
	}

	public void setGoodsinfos(Set goodsinfos) {
		this.goodsinfos = goodsinfos;
	}

}