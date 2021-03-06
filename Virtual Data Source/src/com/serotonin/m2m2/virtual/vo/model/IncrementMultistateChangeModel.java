package com.serotonin.m2m2.virtual.vo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.serotonin.m2m2.virtual.vo.ChangeTypeVO;
import com.serotonin.m2m2.virtual.vo.VirtualPointLocatorVO;
import com.serotonin.m2m2.web.mvc.rest.v1.csv.CSVEntity;

@CSVEntity()
public class IncrementMultistateChangeModel extends VirtualPointLocatorModel {
	
	public IncrementMultistateChangeModel(VirtualPointLocatorVO data) {
		super(data);
		this.data.setChangeTypeId(ChangeTypeVO.Types.INCREMENT_MULTISTATE);
	}
	
	public IncrementMultistateChangeModel() {
		super(new VirtualPointLocatorVO());
		this.data.setChangeTypeId(ChangeTypeVO.Types.INCREMENT_MULTISTATE);
	}
	
	@Override
	public String getTypeName() {
		return IncrementMultistateChangeModelDefinition.TYPE_NAME;
	}
	
	@JsonGetter("values")
	public int[] getValues() {
	    return this.data.getIncrementMultistateChange().getValues();
	}

	@JsonSetter("values")
	public void setValues(int[] values) {
	    this.data.getIncrementMultistateChange().setValues(values);
	}

	@JsonGetter("roll")
	public boolean isRoll() {
	    return this.data.getIncrementMultistateChange().isRoll();
	}

	@JsonSetter("roll")
	public void setRoll(boolean roll) {
	    this.data.getIncrementMultistateChange().setRoll(roll);
	}



}
