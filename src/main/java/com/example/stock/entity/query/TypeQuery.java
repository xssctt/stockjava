package com.example.stock.entity.query;

import com.example.stock.entity.query.BaseQuery;


	/** 
	 *
	 * @Desoription 类型表查询对象
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class TypeQuery extends BaseQuery{
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

	private String nameFuzzy;

	/** 
	 *
	 *  描述
	 */
	private String content;

	private String contentFuzzy;

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

	public void setNameFuzzy(String nameFuzzy) {
		this.nameFuzzy=nameFuzzy;
	}

	public String getNameFuzzy() {
		return this.nameFuzzy;
	}

	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy=contentFuzzy;
	}

	public String getContentFuzzy() {
		return this.contentFuzzy;
	}

}