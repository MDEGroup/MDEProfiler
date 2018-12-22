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
 * This class keeps temporary information computed during the meta-model
 * inference. Such information can be used for subsequent phases.
 * 
 * Information which is kept here:
 * <ul>
 *   <li>Trace links</li>
 *   <li>Hash maps for types</li>
 * </ul>
 * 
 * @author jesus
 *
 */
public class SourceInferenceContext extends InferenceContext {

	private HashMap<Object, Object> oclComputedTypeMap;

	public SourceInferenceContext(Metamodel mm, HashMap<Object, Object> oclComputedTypeMap) {
		super(mm);
		this.oclComputedTypeMap = oclComputedTypeMap;
	}

	/**
	 * Looks up the expression in the transformation trace.
	 * @param value
	 * @return 
	 */
	@Override
	public Feature getFeatureOf(Object value) {		
		Object v = oclComputedTypeMap.get(value);	
		if ( v instanceof Feature ) {
			return (Feature) v;
		}
		return null;
	}
	
}
