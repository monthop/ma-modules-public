package com.serotonin.m2m2.virtual.vo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.serotonin.m2m2.virtual.vo.ChangeTypeVO;
import com.serotonin.m2m2.virtual.vo.VirtualPointLocatorVO;
import com.serotonin.m2m2.web.mvc.rest.v1.csv.CSVEntity;

@CSVEntity()
public class RandomMultistateChangeModel extends VirtualPointLocatorModel {
	
	public RandomMultistateChangeModel(VirtualPointLocatorVO data) {
		super(data);
		this.data.setChangeTypeId(ChangeTypeVO.Types.RANDOM_MULTISTATE);
	}
	
	public RandomMultistateChangeModel() {
		super(new VirtualPointLocatorVO());
		this.data.setChangeTypeId(ChangeTypeVO.Types.RANDOM_MULTISTATE);
	}
	
	@Override
	public String getTypeName() {
		return RandomMultistateChangeModelDefinition.TYPE_NAME;
	}

	@JsonGetter("values")
	public int[] getValues() {
	    return this.data.getRandomMultistateChange().getValues();
	}

	@JsonSetter("values")
	public void setValues(int[] values) {
	    this.data.getRandomMultistateChange().setValues(values);
	}
}
