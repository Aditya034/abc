package com.app.custom_ordering;

import java.util.Comparator;

import com.app.core.Cricketer;

public class CricketerComparator implements Comparator<Cricketer>{

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		// TODO Auto-generated method stub
		
		if (o1.getRating() < o2.getRating())
			return -1;
		if (o1.getRating() == o2.getRating())
			return 0;
		return 1;
	}

}
