public class Zelva
{
    //pozicija
    double x;
    double y;
    //smer
    int fi;
public Zelva(double x1, double y1,int a) {
    x=x1;
    y=y1;
    fi=a;
}
public void zavijLevo(int kot)
{
    fi=fi+kot;
}
public void naprej(double d)
{
    double stariX=x;
    double stariY=y;
    x=stariX+d*Math.cos(Math.toRadians(fi));
    y=stariY+d*Math.sin(Math.toRadians(fi));
    //nariši črto
    StdDraw.line(stariX,stariY,x,y);
}
public static void koch(int n,double korak,Zelva z)
{
    if (n==0)
    {
        z.naprej(korak);
        return;
    }
    koch(n-1,korak,z);
    z.zavijLevo(60);
    koch(n-1,korak,z);
    z.zavijLevo(-120);
    koch(n-1,korak,z);
    z.zavijLevo(60);
    koch(n-1,korak,z);
}
public static void main(String[] args) {
    Zelva z=new Zelva(0,0,0);
    int n=5;
    double korak=1/Math.pow(3,n);
    koch(n,korak,z);
    // Zelva z=new Zelva(0.5,0,180/3);
    // for(int k=0;k<3;k++)
    // {
    //     z.naprej(0.6);
    //     z.zavijLevo(360/3);
    // }
    // Zelva z=new Zelva(0.5,0.5,0);
    // for(int k=0;k<10000;k++)
    // {
    //     z.naprej(0.01);
    //     int kot=(int)(Math.random()*360);
    //     z.zavijLevo(kot);

    // }
}
}