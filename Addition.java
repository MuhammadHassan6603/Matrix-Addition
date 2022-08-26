class Addition
{
    public static void main(String[] args) {
        int A[][]={{2,2},{2,2}};
        int B[][]={{3,3},{3,3}};
        int Res[][]=new int[2][2];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                Res[i][j]=A[i][j]+B[i][j];
                System.out.print(Res[i][j] + " ");
            }
            System.out.println();
        }
    }
}