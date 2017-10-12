package com.app.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.app.model.Uom;
@Component
public class UomUtil {
	public  List<Uom> replaceWithValues(List<Uom> uomList){
		Iterator<Uom> uomItr=uomList.iterator();
		while (uomItr.hasNext()) {
			Uom uom = (Uom) uomItr.next();
			if(getUomTypes().get(uom.getUomType())!=null)
				uom.setUomType(getUomTypes().get(uom.getUomType()));
		}
		return uomList;
	}

	public Map<String,String> getUomTypes() {
		Map<String, String> uomTypes=new LinkedHashMap<String,String>();
		uomTypes.put("Pack","PACKING");
		uomTypes.put("NoPack","NOPACKING");
		uomTypes.put("Bag","BAG");
		uomTypes.put("Box","BOX");
		uomTypes.put("Roll","ROLL");
		uomTypes.put("NA","-NA-");
		return uomTypes;
		
	}
	
}
