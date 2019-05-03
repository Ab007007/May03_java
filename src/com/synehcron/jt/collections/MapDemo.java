package com.synehcron.jt.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo
{
	public static void main(String[] args)
	{
//		Map mp  = new HashMap();
//		Map mp  = new LinkedHashMap();
		Map mp  = new TreeMap();

		mp.put("name", "aravinda");
		mp.put("age",35);
		mp.put("address","BTM");
		
		System.out.println(mp.size());
		//System.out.println(mp.get("address"));
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			String key = (String) it.next();
			System.out.println(mp.get(key));
		}
		
		
		
		
		
		
	}

}
