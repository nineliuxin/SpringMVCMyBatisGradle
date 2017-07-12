package org.fkit.service;

import java.util.List;

import org.fkit.domain.Good;

public interface GoodService {
		List<Good> show(String num);
		Good show2(String suk);
		List<Good> showgood();
}
