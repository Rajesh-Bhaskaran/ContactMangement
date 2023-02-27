package com.thirukkural.searchKural;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public interface SearchControllerCallBack {

	void getKural(int kuralNumber) throws IOException, ParseException;

	void adhigaramSearch(int adhigaramEnn) throws IOException, ParseException;

}
