import java.io.*;
import java.util.* ;
class WordFrequencyCount{
	public static void main(String args[]) throws IOException{
		Console cn = System.console();
		String s = cn.readLine();
		HashMap map = new HashMap();
		HashSet set = new HashSet();
		FileInputStream f = new FileInputStream(s);
		StreamTokenizer st = new StreamTokenizer(f);
		int i = 1 ;
		while(st.nextToken() != StreamTokenizer.TT_EOF){
			String s1 = "";
			/*switch(st.ttype){
				case StreamTokenizer.TT_WORD:
				s1 = st.sval ;
				break;
			}*/
			if(st.ttype == StreamTokenizer.TT_WORD){
				s1 = st.sval ;
				
			}
			if(set.contains(s1)){
				i = (Integer)map.get(s1);
				i++;
				Integer iobj = i ;
				map.put(s1,iobj);
			}
			else{
				set.add(s1);
				i = 1 ;
				Integer iobj = i ;
				map.put(s1,iobj);
			}
	
		}
		Iterator iter = set.iterator();
		String s2 = "";
		while(iter.hasNext()){
			s2 = (String)iter.next();
			System.out.println(s2);
			System.out.println(map.get(s2));
		}	 
	}
}