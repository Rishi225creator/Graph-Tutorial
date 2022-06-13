import java.util.Scanner;
public class GraphDemo{
	public static void main(String[] args){
		GraphRepresentationList graph=new GraphRepresentationList();
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("Enter Total Number Of Nodes");
		n=scan.nextInt();
		int m;
		System.out.println("Enter Total Number Of Edges");
		m=scan.nextInt();
		for(int i=0;i<m;i++){
			int u;
			int v;
			u=scan.nextInt();
			v=scan.nextInt();
			graph.addEdge(u,v,false);
		}
		graph.printAdjList();
	}//End Main
}//End Class
