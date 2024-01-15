package 팀과제.팀과제2;

public class Sravice {
    String _class;
    int price;
    String tB;
    int month;
    int nOfP;
    int no;

    Sravice(){};
    Sravice(String _class,int price,String tB){
        this._class=_class;
        this.price=price;
        this.tB=tB;
    }

    Sravice(int no,String _class,String tB,int nOfP,int month){
        this.no=no;
        this._class=_class;
        this.tB=tB;
        this.nOfP=nOfP;
        this.month=month;
    }
}

