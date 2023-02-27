package com.thirukkural.searchKural;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;
import com.thirukkural.repository.KuralRepository;

public class SerachKuralModel implements SearchModelCallBack{

	private SearchControllerCallBack searchKuralController;
	
	public SerachKuralModel(SearchControllerCallBack searchKuralController) {
		this.searchKuralController=searchKuralController;
	}

	@Override
	public KuralInfo getKural(int kuralNumber) throws IOException, ParseException {
		return KuralRepository.getInstance().getKural(kuralNumber);
		
	}

	@Override
	public List<KuralInfo> getadhigaram(int adhigaramNumber) throws IOException, ParseException {
		adhigaramNumber=adhigaramNumber*10-9;
		return KuralRepository.getInstance().getadhigaram(adhigaramNumber);
	}

	

}
