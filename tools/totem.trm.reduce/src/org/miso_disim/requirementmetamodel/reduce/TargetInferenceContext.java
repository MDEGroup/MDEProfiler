package org.miso_disim.requirementmetamodel.reduce;

import java.util.HashMap;
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


/**
 * Similar to {@link SourceInferenceContext} but for the target.
 * 
 * 
 * @author jesus
 *
 */
public class TargetInferenceContext extends InferenceContext {

	private HashMap<Object, Object> traceLinks;

	public TargetInferenceContext(Metamodel mm, HashMap<Object, Object> traceLinks) {
		super(mm);
		this.traceLinks = traceLinks;
	}


	/**
	 * Looks up the expression in the transformation trace.
	 * @param value
	 * @return 
	 */
	@Override
	public Feature getFeatureOf(Object value) {		
		Object v = traceLinks.get(value);	
		if ( v instanceof Feature ) {
			return (Feature) v;
		}
		return null;
	}

	
}
