package com.thirukkural.searchKural;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public class SearchKuralController implements SearchControllerCallBack,SearchControllerModelCallBack{

	private SerachViewCallBack serachKuralView;
	private SearchModelCallBack serachKuralModel;
	
	public SearchKuralController(SerachViewCallBack serachKuralView) {
		this.serachKuralView=serachKuralView;
		serachKuralModel=new SerachKuralModel(this);
	}

	@Override
	public void getKural(int kuralNumber) throws IOException, ParseException {
	   if(kuralNumber<1||kuralNumber>1330) {
		   serachKuralView.getCorrectNumber();
	   }
	   else {
		   serachKuralView.showKural(serachKuralModel.getKural(kuralNumber-1));
	   }
	
	}

	@Override
	public void adhigaramSearch(int adhigaramNumber) throws IOException, ParseException {
		if(adhigaramNumber<1||adhigaramNumber>133) {
			   serachKuralView.getCorrectadhigaramNumber();
		   }
		   else {
			   serachKuralView.showAdhigaram(serachKuralModel.getadhigaram(adhigaramNumber));
		   }
	}

}
