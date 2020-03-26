package com.woniu.pojo;

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
}