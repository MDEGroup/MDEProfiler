package org.miso_disim.requirementmetamodel.reduce;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

import MM_uncertainty.MM_uncertaintyFactory;
import MM_uncertainty.Many;
import MM_uncertainty.UBoolean;
import MM_uncertainty.UnknowClass;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.impl.IntegerTypeImpl;
import anatlyzer.atlext.OCL.impl.StringTypeImpl;

public class TypeUtils {

	
	public static EDataType getEcoreType(OclType t) throws UndefinedTypeException{
		if(t instanceof StringTypeImpl)
			return EcorePackage.eINSTANCE.getEString();
		if(t instanceof IntegerTypeImpl)
			return EcorePackage.eINSTANCE.getEInt();
		else throw new UndefinedTypeException();
	}
	
	private static int id = 0;
	
	public static UnknowClass createUnknownClass() {
		UnknowClass c = MM_uncertaintyFactory.eINSTANCE.createUnknowClass();
		c.setName("u" + (++id));
		return c;
	}
	
	public static Many createMany() {
		Many many = MM_uncertaintyFactory.eINSTANCE.createMany();
		many.setIsDuplicated(UBoolean.DONT_KNOW);
		many.setIsOrdered(UBoolean.DONT_KNOW);
		return many;
	}
}
