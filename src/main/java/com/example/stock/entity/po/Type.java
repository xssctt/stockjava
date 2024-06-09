package com.example.stock.entity.po;

import java.io.Serializable;


	/** 
	 *
	 * @Desoription 类型表
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class Type implements Serializable{
	/** 
	 *
	 *  id
	 */
	private Integer id;

	/** 
	 *
	 *  类型名称
	 */
	private String name;

	/** 
	 *
	 *  描述
	 */
	private String content;

	/** 
	 *
	 *  有父类类型
	 */
	private Integer parentId;

	public void setId(Integer id) {
		this.id=id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getContent() {
		return this.content;
	}

	public void setParentId(Integer parentId) {
		this.parentId=parentId;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	@Override
	public String toString() {
	return " FieIdInfo{ " + 
	 " id : Id='" +(id==null ? "空" : id) + "' "+
	 " 类型名称 : Name='" +(name==null ? "空" : name) + "' "+
	 " 描述 : Content='" +(content==null ? "空" : content) + "' "+
	 " 有父类类型 : ParentId='" +(parentId==null ? "空" : parentId) + "' "+ '}'; 
	}
}