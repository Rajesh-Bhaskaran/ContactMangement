package com.thirukkural.searchKural;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.thirukkural.dto.KuralInfo;

public interface SearchModelCallBack {

	KuralInfo getKural(int kuralNumber) throws IOException, ParseException;

	List<KuralInfo> getadhigaram(int adhigaramNumber) throws IOException, ParseException;

}
