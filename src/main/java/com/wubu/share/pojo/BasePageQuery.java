package com.wubu.share.pojo;

import java.io.Serializable;

/**
 * @author wangxf@uubee.com
 * @comment 所有分页查询参数对象的父类
 * @date 创建时间：2015年7月23日 上午10:57:07
 * @version 1.0
 * @since
 */
public class BasePageQuery implements Serializable{

	private static final long serialVersionUID = 3563576143366075196L;

	private static final int MAX_PAGE_SIZE = 100;

	private static final int MIN_PAGE_SIZE = 1;
	private static final int DEFAULT_PAGE_SIZE = 10;

	private int page = 1;

	protected int pageSize = DEFAULT_PAGE_SIZE;

	/**
	 * 
	 * @return 起始位置，直接用于mysql分页的第一个参数<br>
	 *         e.g from xxx limit #start#,#pageSize#
	 */
	public int getStart() {
		return (page - 1) * getPageSize();
	}

	/**
	 * 设置页码
	 * @param page 页码 从1开始 如1,2,3...
	 */
	public void setPage(int page) {
		if (page <= 0) {
			page = 1;
		}
		this.page = page;
	}

	
	public int getPage() {
		return page;
	}

	/**
	 * 
	 * @return 每页数量
	 */
	public int getPageSize() {
		if (pageSize < MIN_PAGE_SIZE) {
			return MIN_PAGE_SIZE;
		}
		if (pageSize > MAX_PAGE_SIZE) {
			return MAX_PAGE_SIZE;
		}
		return pageSize;
	}

	/**
	 * 设置每页数量
	 * @param pageSize 
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
