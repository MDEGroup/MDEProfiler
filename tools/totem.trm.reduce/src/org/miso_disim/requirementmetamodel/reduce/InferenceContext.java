package org.miso_disim.requirementmetamodel.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import anatlyzer.atlext.OCL.OclExpression;
import MM_uncertainty.Boolean_;
import MM_uncertainty.DataType;
import MM_uncertainty.Feature;
import MM_uncertainty.Integer_;
import MM_uncertainty.Metamodel;
import MM_uncertainty.Real_;
import MM_uncertainty.String_;

public abstract class InferenceContext {

	private Metamodel mm;
	
	public InferenceContext(Metamodel mm) {
		this.mm = mm;
	}

	public List<MM_uncertainty.Class> getClasses() {
		return new ArrayList<MM_uncertainty.Class>(mm.getClasses());
	}
	
	public List<Feature> getFeatures() {
		return mm.getClasses().stream().flatMap(c -> c.getFeats().stream()).collect(Collectors.toList());		
	}
	
	public MM_uncertainty.Class findClassByName(String name) {
		return mm.getClasses().stream().filter(c -> name.equals(c.getName())).findFirst().orElseThrow(() -> new IllegalArgumentException("No class " + name));
	}

	
	public DataType getIntegerType() { return findDataType(Integer_.class); }
	public DataType getRealType() { return findDataType(Real_.class); }
	public DataType getStringType() { return findDataType(String_.class); }
	public DataType getBooleanType() { return findDataType(Boolean_.class); }

	private DataType findDataType(Class<?> clazz) {
		return mm.getDataType().stream().filter(d -> clazz.isInstance(d)).findAny().orElseThrow(() -> new IllegalStateException("No data type found " + clazz.getName()));
	}

	abstract Feature getFeatureOf(Object o);
}
