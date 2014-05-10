package ch.fhnw.oopI2.wo3.u3;

/**
 * Created by raphi on 03.03.14.
 */
public class Main {

    public static void main(String[] args)
    {
        Resultate<Eiskunstlaeufer> eisRes = new Resultate<Eiskunstlaeufer>();
        eisRes.add(new Eiskunstlaeufer(46));
        eisRes.add(new Eiskunstlaeufer(12));
        eisRes.add(new Eiskunstlaeufer(120));
        eisRes.add(new Eiskunstlaeufer(11));
        eisRes.add(new Eiskunstlaeufer(76));
        eisRes.add(new Eiskunstlaeufer(52));
        eisRes.add(new Eiskunstlaeufer(91));
        eisRes.add(new Eiskunstlaeufer(15));
        eisRes.add(new Eiskunstlaeufer(26));

        System.out.println(eisRes.computeAverage());

        Eiskunstlaeufer e1 = eisRes.getWinner();
        System.out.println(e1.toString());

/*        Resultate<Object> sr1 = new Resultate<Object>();
        sr1.add(new Rennfahrer(43));

        Resultate<Sportler> sr2 = new Resultate<Sportler>();
        sr2.add(new Sportler());

        Resultate<Sportler> sr3 = new Resultate<Eiskunstlaeufer>();
        sr3.add(new Rennfahrer(34));

        Resultate<Rennfahrer> sr4 = new Resultate<Rennfahrer>();
        sr4.add(new Rennfahrer(34));
        Object o = sr4.getWinner();

        Resultate<Sportler> sr5 = new Resultate<Sportler>();
        sr5.add(new Rennfahrer(45));
        Rennfahrer rf5 = sr5.getWinner();

        Resultate<?> sr6 = new Resultate<Rennfahrer>();
        sr6.add(new Rennfahrer(54));
        Rennfahrer rf6 = sr6.getWinner();

        Resultate<? extends Rennfahrer> sr7 = new Resultate<Rennfahrer>();
        sr7.add(new Rennfahrer(34));
        Rennfahrer rf7 = sr7.getWinner();

        Resultate<? super Rennfahrer> sr8 = new Resultate<Rennfahrer>();
        sr8.add(new Rennfahrer(34));
        Rennfahrer rf8 = sr8.getWinner();*/









    }

}
