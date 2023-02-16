package wayFair;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
	
	public static Map<Character, Integer> frequent() {
		String s="Mahesh";
		
		Map<Character, Integer> map=new HashMap<>();
		Integer count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count=count+1;
				}
			}
			if(count>0) {
				map.put(s.charAt(i), count);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}

}
