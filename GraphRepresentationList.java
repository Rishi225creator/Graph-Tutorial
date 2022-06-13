import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
public class GraphRepresentationList{
	Map<Integer,ArrayList<Integer>> adjList=new HashMap<Integer,ArrayList<Integer>>();
	void addEdge(int u,int v,boolean direction){
		if(adjList.containsKey(u)){
			adjList.get(u).add(v);
		}else{
			adjList.put(u,new ArrayList<Integer>());
			adjList.get(u).add(v);
		}
		if(direction==false){
			if(adjList.containsKey(v)){
				adjList.get(v).add(u);
			}else{
				adjList.put(v,new ArrayList<Integer>());
				adjList.get(v).add(u);
			}
		}
	}//Add Edges
	void printAdjList(){
		for(Map.Entry<Integer,ArrayList<Integer>> entry:adjList.entrySet()){
			System.out.print(entry.getKey()+"->");
			for(Integer itr:entry.getValue()){
				System.out.print(itr+",");
			}
			System.out.print("\n");
		}
	}//End Print
}//End Class
