 class ThreedimensionalArray {
public static void main(String[] args) 
{
    int[ ][ ][ ] x;
         x = new int[3][3][3];

    for(int i = 0; i < 3; i++)
    {
       for(int j = 0; j < 3; j++)	 
           for(int k = 0; k < 3; k++)
	       x[i][j][k] = i + 1;
    }
    for(int i = 0; i < 3; i++)
    {
        System.out.println("Table-" +(i + 1));
        for(int j = 0; j < 3; j++)
        {
	   for(int k = 0; k < 3; k++)
	   System.out.print(x[i][j][k] +" ");	 
	   System.out.println();
        }
        System.out.println();  
    }
  }
}
