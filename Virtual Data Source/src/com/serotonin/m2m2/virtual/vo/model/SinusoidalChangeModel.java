package com.serotonin.m2m2.virtual.vo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.serotonin.m2m2.virtual.vo.ChangeTypeVO;
import com.serotonin.m2m2.virtual.vo.VirtualPointLocatorVO;
import com.serotonin.m2m2.web.mvc.rest.v1.csv.CSVEntity;

@CSVEntity()
public class SinusoidalChangeModel extends VirtualPointLocatorModel {
	
	public SinusoidalChangeModel(VirtualPointLocatorVO data) {
		super(data);
		this.data.setChangeTypeId(ChangeTypeVO.Types.ALTERNATE_BOOLEAN);
	}
	
	public SinusoidalChangeModel() {
		super(new VirtualPointLocatorVO());
		this.data.setChangeTypeId(ChangeTypeVO.Types.ALTERNATE_BOOLEAN);
	}
	
	@Override
	public String getTypeName() {
		return SinusoidalChangeModelDefinition.TYPE_NAME;
	}
	
	@JsonGetter("amplitude")
	public double getAmplitude() {
	    return this.data.getSinusoidalChange().getAmplitude();
	}

	@JsonSetter("amplitude")
	public void setAmplitude(double amplitude) {
	    this.data.getSinusoidalChange().setAmplitude(amplitude);
	}

	@JsonGetter("offset")
	public double getOffset() {
	    return this.data.getSinusoidalChange().getOffset();
	}

	@JsonSetter("offset")
	public void setOffset(double offset) {
	    this.data.getSinusoidalChange().setOffset(offset);
	}

	@JsonGetter("period")
	public double getPeriod() {
	    return this.data.getSinusoidalChange().getPeriod();
	}

	@JsonSetter("period")
	public void setPeriod(double period) {
	    this.data.getSinusoidalChange().setPeriod(period);
	}

	@JsonGetter("phaseShift")
	public double getPhaseShift() {
	    return this.data.getSinusoidalChange().getPhaseShift();
	}

	@JsonSetter("phaseShift")
	public void setPhaseShift(double phaseShift) {
	    this.data.getSinusoidalChange().setPhaseShift(phaseShift);
	}

}
