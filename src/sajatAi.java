package ai;
import enums.Iranyok;
import enums.PalyaElemek;
import interfaces.Adat;
import interfaces.Ai;
import interfaces.Test;
import java.awt.geom.Point2D;

public class sajatAi implements Ai {

    Adat adat;
    Test test;

    public sajatAi() {
    }
    public void initAdat(Adat adat) {
        this.adat = adat;
    }
    public void initKukac(Test kukac) {
        this.test = kukac;
    }
    public Iranyok setIrany() {
        Iranyok irany = this.test.getIrany();
        Point2D p = this.test.getFej();
        if (p.getX() > this.adat.getEtel().getX()) {
            irany = Iranyok.BAL;
        } else if (p.getX() < this.adat.getEtel().getX()) {
            irany = Iranyok.JOBB;
        } else if (p.getY() > this.adat.getEtel().getY()) {
            irany = Iranyok.FEL;
        } else if (p.getY() < this.adat.getEtel().getY()) {
            irany = Iranyok.LE;
        }

        Point2D kovPontAdd = new Point2D.Double(p.getX() + (double)irany.getXm(), p.getY() + (double)irany.getYm());

        for(int i = 1; (this.adat.getPalyaElem((int)kovPontAdd.getX(), (int)kovPontAdd.getY()) == PalyaElemek.FAL || this.adat.getPalyaElem((int)kovPontAdd.getX(), (int)kovPontAdd.getY()) == PalyaElemek.TEST) && i <= 4; ++i) {
            if (irany == Iranyok.FEL) {
                irany = Iranyok.JOBB;
            } else if (irany == Iranyok.JOBB) {
                irany = Iranyok.LE;
            } else if (irany == Iranyok.LE) {
                irany = Iranyok.BAL;
            } else if (irany == Iranyok.BAL) {
                irany = Iranyok.FEL;
            }

            kovPontAdd = new Point2D.Double(p.getX() + (double)irany.getXm(), p.getY() + (double)irany.getYm());
        }

        return irany;
    }
    public String getNev() {
        return "Teszt Elek";
    }


}
