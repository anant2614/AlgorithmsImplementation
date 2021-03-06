import java.util.Scanner;

public class CCGraph {
	static final int MAXV      = 100;
    static final int MAXDEGREE = 50;
    public int       edges[][] = new int[MAXV + 1][MAXDEGREE];
    public int       degree[]  = new int[MAXV + 1];
    public int       nvertices;
    public int       nedges;
 
    CCGraph()
    {
        nvertices = nedges = 0;
        for (int i = 1; i <= MAXV; i++)
            degree[i] = 0;
    }
 
    void read_CCGraph(boolean directed)
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        nvertices = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int m = sc.nextInt();
        System.out.println("Enter the edges: <from> <to>");
        for (int i = 1; i <= m; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            insert_edge(x, y, directed);
        }
        sc.close();
    }
 
    void insert_edge(int x, int y, boolean directed)
    {
        if (degree[x] > MAXDEGREE)
            System.out.printf(
                    "Warning: insertion (%d, %d) exceeds max degree\n", x, y);
        edges[x][degree[x]] = y;
        degree[x]++;
        if (!directed)
            insert_edge(y, x, true);
        else
            nedges++;
    }
 
    void print_CCGraph()
    {
        for (int i = 1; i <= nvertices; i++)
        {
            System.out.printf("%d: ", i);
            for (int j = degree[i] - 1; j >= 0; j--)
                System.out.printf(" %d", edges[i][j]);
            System.out.printf("\n");
        }
    }
}
