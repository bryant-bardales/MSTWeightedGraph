package MTSW;

class MSTWApp
{
	public static void main(String[] args)
	{
		Graph theGraph = new Graph();
		theGraph.addVertex('4');    // 0  (start for mst)
		theGraph.addVertex('3');    // 1
		theGraph.addVertex('5');    // 2
		theGraph.addVertex('2');    // 3
		theGraph.addVertex('8');    // 4
		theGraph.addVertex('6');    // 5
		theGraph.addVertex('1');    // 6
		theGraph.addVertex('7');    // 7
		theGraph.addVertex('0');    // 8

		theGraph.addEdge(0, 1, 9);  // AB  6
		theGraph.addEdge(0, 2, 10); // AD  4
		theGraph.addEdge(1, 2, 14); // BC 10
		theGraph.addEdge(1, 3, 7);  // BD  7
		theGraph.addEdge(3, 2, 4);  // BE  7
		theGraph.addEdge(3, 4, 2);  // CD  8
		theGraph.addEdge(3, 6, 8);  // CE  5
		theGraph.addEdge(4, 7, 7);  // CF  6
		theGraph.addEdge(4, 5, 6);  // DE 12
		theGraph.addEdge(4, 5, 7);  // EF  7
		theGraph.addEdge(5, 7, 1);  // EF  7
		theGraph.addEdge(5, 2, 2);  // EF  7
		theGraph.addEdge(4, 5, 7);  // EF  7
		theGraph.addEdge(4, 5, 7);  // EF  7
		theGraph.addEdge(4, 5, 7);  // EF  7
		theGraph.addEdge(6, 8, 4);  // EF  7
		theGraph.addEdge(6, 7, 11);  // EF  7
		theGraph.addEdge(7, 8, 8);  // EF  7

		System.out.print("Minimum spanning tree: ");
		theGraph.mstw();            // minimum spanning tree
		System.out.println();
	}  // end main()
}  // end class MSTWApp