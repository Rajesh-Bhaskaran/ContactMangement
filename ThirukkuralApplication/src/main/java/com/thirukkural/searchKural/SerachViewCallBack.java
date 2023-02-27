package com.thirukkural.searchKural;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public interface SerachViewCallBack {

	void getCorrectNumber() throws IOException, ParseException;

	void showKural(KuralInfo kural) throws IOException, ParseException;

	void getCorrectadhigaramNumber() throws IOException, ParseException;

	void showAdhigaram(List<KuralInfo> getadhigaram) throws IOException, ParseException;

}
