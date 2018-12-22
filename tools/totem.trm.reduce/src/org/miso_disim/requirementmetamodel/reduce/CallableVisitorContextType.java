package org.miso_disim.requirementmetamodel.reduce;

import anatlyzer.atlext.ATL.Callable;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.processing.AbstractVisitor;

public class CallableVisitorContextType extends AbstractVisitor {
	
	private Object callable;
	
	//private HashMap<OclFeature, OclType> oclFeatureMap = new HashMap<OclFeature, OclType>();
	private OclType oclType;
	public Object getElement() {
		return callable;
	}

	public OclType getOclType() {
		return oclType;
	}

	public void perform(Callable callable) {
		startVisiting(callable);
	}
	
//	@Override
//	public void beforeAttribute(Attribute self) {
//		callable = self;
//		oclType = self.getType();
//	}
	
	@Override
	public void beforeContextHelper(ContextHelper self) {
		callable = self;
		oclType = self.getDefinition().getContext_().getContext_();
	}
	@Override
	public void beforeAttribute(Attribute self) {
		callable = self;
		oclType = self.getType();
	}
	
	@Override
	public void beforeLazyRule(LazyRule self) {
		if(self.getOutPattern().getElements().size()!=0) {
			OutPatternElement outClass = self.getOutPattern().getElements().get(0);
			OclModelElement as = OCLFactory.eINSTANCE.createOclModelElement();
			as.setName(outClass.getType().getName());
			callable = self;
			oclType = as;
		}
	}
}
