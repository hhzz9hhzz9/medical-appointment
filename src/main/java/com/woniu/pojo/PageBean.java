package com.woniu.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
	private Integer nowPage;
	private Integer pageRow = 5;
	private Integer countRow;
	private Integer countPage;
	private List<T> list;
	private String queryVal;
	private Date someday; //某天
	private Date firstDate; //起始时间
	private Date lastDate; //结束时间
}
