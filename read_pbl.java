package com.company;
import java.util.*;
import java.util.Scanner;

public class read_pbl
{
    static int N = 5;       // final_path[] stores the final solution ie, the
    // path of the salesman.
    static int final_path[] = new int[N + 1];   // visited[] keeps track of the already visited nodes
    // in a particular path
    static boolean visited[] = new boolean[N];  // Stores the final minimum weight of shortest tour.
    static int final_res = Integer.MAX_VALUE;   // Function to copy temporary solution to the final solution
    static void copyToFinal(int curr_path[])
    {
        for (int i = 0; i < N; i++)
            final_path[i] = curr_path[i];
        final_path[N] = curr_path[0];
    }

    // Function to find the minimum edge cost
    // having an end at the vertex i
    static int firstMin(int adj[][], int i)
    {
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < N; k++)
            if (adj[i][k] < min && i != k)
            {
                min = adj[i][k];
            }
        return min;
    }

    // function to find the second minimum edge cost
    // having an end at the vertex i
    static int secondMin(int adj[][], int i)
    {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int j=0; j<N; j++)
        {
            if (i == j)
                continue;

            if (adj[i][j] <= first)
            {
                second = first;
                first = adj[i][j];
            }
            else if (adj[i][j] <= second &&
                    adj[i][j] != first)
                second = adj[i][j];
        }
        return second;
    }

    // function that takes as arguments:
    // curr_bound -> lower bound of the root node
    // curr_weight-> stores the weight of the path so far
    // level-> current level while moving in the search
    //		 space tree
    // curr_path[] -> where the solution is being stored which
    //			 would later be copied to final_path[]
    static void TSPRec(int adj[][], int curr_bound, int curr_weight,
                       int level, int curr_path[])
    {
        // base case is when we have reached level N which means we have covered all the nodes once
        if (level == N)
        {
            // check if there is an edge from last vertex in path back to the first vertex
            if (adj[curr_path[level - 1]][curr_path[0]] != 0)
            {
                // curr_res has the total weight of the solution we got
                int curr_res = curr_weight +
                        adj[curr_path[level-1]][curr_path[0]];

                // Update final result and final path if current result is better.
                if (curr_res < final_res)
                {
                    copyToFinal(curr_path);
                    final_res = curr_res;
                }
            }
            return;
        }

        // for any other level iterate for all vertices to build the search space tree recursively
        for (int i = 0; i < N; i++)
        {
            // Consider next vertex if it is not same (diagonal entry in adjacency matrix and not visited already)
            if (adj[curr_path[level-1]][i] != 0 && visited[i] == false)
            {
                int temp = curr_bound;
                curr_weight += adj[curr_path[level - 1]][i];

                // different computation of curr_bound for level 2 from the other levels
                if (level==1)
                    curr_bound -= ((firstMin(adj, curr_path[level - 1]) +
                            firstMin(adj, i))/2);
                else
                    curr_bound -= ((secondMin(adj, curr_path[level - 1]) +
                            firstMin(adj, i))/2);

                // curr_bound + curr_weight is the actual lower bound for the node that we have arrived on
                // If current lower bound < final_res, we need to explore the node further
                if (curr_bound + curr_weight < final_res)
                {
                    curr_path[level] = i;
                    visited[i] = true;

                    // call TSPRec for the next level
                    TSPRec(adj, curr_bound, curr_weight, level + 1,
                            curr_path);
                }

                // Else we have to prune the node by resetting all changes to curr_weight and curr_bound
                curr_weight -= adj[curr_path[level-1]][i];
                curr_bound = temp;

                // Also reset the visited array
                Arrays.fill(visited,false);
                for (int j = 0; j <= level - 1; j++)
                    visited[curr_path[j]] = true;
            }
        }
    }

    // This function sets up final_path[]
    static void TSP(int adj[][])
    {
        int curr_path[] = new int[N + 1];

        // Calculate initial lower bound for the root node
        // using the formula 1/2 * (sum of first min + second min) for all edges.
        // Also initialize the curr_path and visited array
        int curr_bound = 0;
        Arrays.fill(curr_path, -1);
        Arrays.fill(visited, false);

        // Compute initial bound
        for (int i = 0; i < N; i++)
            curr_bound += (firstMin(adj, i) + secondMin(adj, i));

        // Rounding off the lower bound to an integer
        curr_bound = (curr_bound==1)? curr_bound/2 + 1 :
                curr_bound/2;

        // We start at vertex 1 so the first vertex
        // in curr_path[] is 0
        visited[0] = true;
        curr_path[0] = 0;

        // Call to TSPRec for curr_weight equal to
        // 0 and level 1
        TSPRec(adj, curr_bound, 0, 1, curr_path);
    }

    // Driver code
    public static void main(String[] args)
    {
        boolean validity = true;
        int choice;
        float marks;
        int condition = 0;
        Scanner sc = new Scanner(System.in);
        while(validity)
        {
            System.out.println();
            System.out.println("Enter MHTCET Percentile:");
            marks = sc.nextFloat();
            System.out.println(marks);

            if(marks>=95 && marks<=100)
            {
                System.out.println("Top Colleges for you: \n1)COEP \n2)PICT \n3)VIT \n4)VIIT ");
                condition = 1;
            }
            else if(marks>=90 && marks<95)
            {
                System.out.println("Top Colleges for you: \n1)D.Y.Patil Akurdi \n2) MIT WPU \n3) MIT ADT \n4) JSPM ");
                condition = 2;
            }
            else if(marks>=85 && marks<90)
            {
                System.out.println("Top Colleges for you: \n1) Modern College Of Engineering  \n2) AISSMS \n3) MIT Alandi \n4) DY Patil Pimpri ");
                condition = 3;
            }
            else if(marks<85)
            {
                System.out.println("Top Colleges for you: \n1) MMMCOE (Marathwada Mitra Mandal College of Enginerring) \n2) Kashibai Navale College of Engineering \n3) Sinhagad College of Engineering \n4) Sinhagad College of Engineering Kondhwa  ");
                condition = 4;
            }

            int MatrixOne[][] = {   { 0, 3, 12, 10, 10},
                    { 3, 0, 11, 10,12 },
                    { 12, 11, 0, 4,6 },
                    { 10, 10, 4, 0, 3},
                    { 10,12 ,6 ,3 ,0}   };
            int MatrixTwo[][] = {   { 0, 14, 9, 18,16 },
                    { 14, 0, 20, 32,35 },
                    { 9, 20, 0, 26, 15},
                    { 18, 32, 26, 0, 29},
                    {16, 35, 15, 29,0}  };
            int MatrixThree[][] = { { 0, 4, 2, 19,14 },
                    { 4, 0, 4, 21,13 },
                    { 2, 4, 0, 20,14 },
                    { 19, 21, 20, 0,12 },
                    { 14, 13, 14,12,0}  };
            int MatrixFour[][] = {  { 0,11, 14, 13,12 },
                    { 11, 0, 7, 7,11 },
                    { 14, 7, 0, 1, 9},
                    { 13, 7, 1, 0,9 },
                    { 12, 11, 9, 9,0 }  };

            switch (condition) {
                case 1:
                {
                    System.out.println();
                    TSP(MatrixOne);
                    break;
                }
                case 2:
                {
                    System.out.println();
                    TSP(MatrixTwo);
                    break;
                }
                case 3:
                {
                    System.out.println();
                    TSP(MatrixThree);
                    break;
                }
                case 4:
                {
                    System.out.println();
                    TSP(MatrixFour);
                    break;
                }
            }

            System.out.printf("Minimum cost : %d kms\n", final_res);
            System.out.print("Path Taken : ");
            for (int i = 0; i <= N; i++)
            {
                if(final_path[i]==0)
                {
                    System.out.print("Pune Station");
                }
                else if(final_path[i]==1 && condition==1)
                {
                    System.out.print("COEP");
                }
                else if(final_path[i]==2 && condition==1)
                {
                    System.out.print("PICT");
                }
                else if(final_path[i]==3 && condition==1)
                {
                    System.out.print("VIT");
                }
                else if(final_path[i]==4 && condition==1)
                {
                    System.out.print("VIIT");
                }
                else if(final_path[i]==1 && condition==2)
                {
                    System.out.print("D.Y.Patil Akurdi");
                }
                else if(final_path[i]==2 && condition==2)
                {
                    System.out.print("MIT WPU");
                }
                else if(final_path[i]==3 && condition==2)
                {
                    System.out.print("MIT ADT");
                }
                else if(final_path[i]==4 && condition==2)
                {
                    System.out.print("JSPM");
                }
                else if(final_path[i]==1 && condition==3)
                {
                    System.out.print("Modern College Of Engineering");
                }
                else if(final_path[i]==2 && condition==3)
                {
                    System.out.print("AISSMS");
                }
                else if(final_path[i]==3 && condition==3)
                {
                    System.out.print("MIT Alandi");
                }
                else if(final_path[i]==4 && condition==3)
                {
                    System.out.print("D.Y.Patil Pimpri");
                }
                else if(final_path[i]==1 && condition==4)
                {
                    System.out.print("MMMCOE (Marathwada Mitra Mandal College of Enginerring)");
                }
                else if(final_path[i]==2 && condition==4)
                {
                    System.out.print("Kashibai Navale College of Engineering");
                }
                else if(final_path[i]==3 && condition==4)
                {
                    System.out.print("Sinhagad College of Engineering,Vadgoan");
                }
                else if(final_path[i]==4 && condition==4)
                {
                    System.out.print("Sinhagad College of Engineering,Kondhwa");
                }
//            System.out.printf("%d ", final_path[i]);
                if(i<N)
                {
                    System.out.print("-> ");
                }

            }

            System.out.println("\n\nDo you want to continue?");
            System.out.println("Press: \n\t1)Yes\n\t2)No");
            choice=sc.nextInt();
            if(choice==1)
            {
                validity=true;
            }
            else
            {
                validity=false;
            }

        }


    }
}


