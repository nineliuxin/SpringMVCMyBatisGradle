package org.fkit.service;

import org.fkit.domain.Collection;
import org.fkit.domain.Good;

public interface CollectionService {
		void addCollection(String user_name,String goodname);
		Collection selectCollection(String user_name,String goodname);
		Good selectGood(String goodname);
}
