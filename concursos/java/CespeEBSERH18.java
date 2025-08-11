package concursos.java;

public class CespeEBSERH18
{
    static void Faca( int[] z )
    {
        int[] A = z ;
        A[0] = z[4]*10;
        A[1] = z[3]/10;
    }
}

class Teste
{
    public static void main ( String[] args )
    {
        int meuArray[] = {10, 20, 30, 40, 50} ;
        CespeEBSERH18.Faca( meuArray ) ;

        for (int j = 0; j < meuArray.length; j++ )
            System.out.print( meuArray[j] + " " ) ;
    }
}
