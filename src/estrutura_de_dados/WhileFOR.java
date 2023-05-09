package estrutura_de_dados;

public class WhileFOR {
    static public void main(String[] args) {
        int x, y;
        x = 0;
        y = 1000;
//        for	(int i = 0;i < 10;i++)	{
//            System.out.println("rodou mais uma vez");
//        }
        for	(int	i	=	x;	i	<	y;	i++)	{
            if	(i	%	19	==	0)	{
                System.out.println("Achei	um	número	divisível	por	19	entre	x	e	y");
                continue;
            }
            System.out.println(i);
        }
    }
}
