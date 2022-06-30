public class threearray {
    public static void main(String n[])
    {
        int collegemarks [][][]= {  {{10,6,7,3,5},{5,9,10,9,7},{9,8,6,8,5}},{{10,6,7,3,5},{5,9,10,9,7},{9,8,6,8,5}},{{10,6,7,3,5},{5,9,10,9,7},{9,8,6,8,5}}};
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(collegemarks[i][j][k] +"\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    
}
