package com.wubu.share.wrapper;

import java.util.List;

public class ModelListResult<T> extends ModelResult<List<T>> {

	private static final long serialVersionUID = -3201258125194527457L;
	/** 列表总数 */
	private Integer count = 0;

	private Long totalAmt = 0L;

	public ModelListResult() {
		super();
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}
}
