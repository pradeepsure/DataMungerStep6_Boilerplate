package com.stackroute.datamunger.query;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Processing queries with group by clause will result in GroupedDataSet which will 
 * contain multiple dataSets, each of them indexed with the key column. Hence, the 
 * structure has been taken as a subtype of HashMap<String,Object>
 */

public class GroupedDataSet extends LinkedHashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> groupDataSetMap;

	public GroupedDataSet() {
		super();
	}

	public GroupedDataSet(Map<String, Object> groupDataSetMap) {
		super();
		this.groupDataSetMap = groupDataSetMap;
	}

	public Map<String, Object> getGroupDataSetMap() {
		return groupDataSetMap;
	}

	public void setGroupDataSetMap(Map<String, Object> groupDataSetMap) {
		this.groupDataSetMap = groupDataSetMap;
	}

}
