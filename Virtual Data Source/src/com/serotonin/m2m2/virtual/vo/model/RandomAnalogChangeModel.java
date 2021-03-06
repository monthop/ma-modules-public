package com.serotonin.m2m2.virtual.vo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.serotonin.m2m2.virtual.vo.ChangeTypeVO;
import com.serotonin.m2m2.virtual.vo.VirtualPointLocatorVO;
import com.serotonin.m2m2.web.mvc.rest.v1.csv.CSVEntity;

@CSVEntity()
public class RandomAnalogChangeModel extends VirtualPointLocatorModel {
	
	public RandomAnalogChangeModel(VirtualPointLocatorVO data) {
		super(data);
		this.data.setChangeTypeId(ChangeTypeVO.Types.RANDOM_ANALOG);
	}
	
	public RandomAnalogChangeModel() {
		super(new VirtualPointLocatorVO());
		this.data.setChangeTypeId(ChangeTypeVO.Types.RANDOM_ANALOG);
	}
	@Override
	public String getTypeName() {
		return RandomAnalogChangeModelDefinition.TYPE_NAME;
	}
	
	@JsonGetter("min")
	public double getMin() {
	    return this.data.getRandomAnalogChange().getMin();
	}

	@JsonSetter("min")
	public void setMin(double min) {
	    this.data.getRandomAnalogChange().setMin(min);
	}

	@JsonGetter("max")
	public double getMax() {
	    return this.data.getRandomAnalogChange().getMax();
	}

	@JsonSetter("max")
	public void setMax(double max) {
	    this.data.getRandomAnalogChange().setMax(max);
	}

}
