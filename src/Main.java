public class Main {
            public static void main(String[] args) {
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;
                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);
                dog = dog + 4;
                cat = cat + 4;
                paper = paper + 4;
                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);
                dog = dog - 3.5;
                cat = cat - 1.6;
                paper = paper - 7638;
                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);

                var friend = 19;
                System.out.println(friend);
                friend = friend + 2;
                System.out.println(friend);
                friend = friend / 7;
                System.out.println(friend);

                var frog = 3.5;
                System.out.println(frog);
                frog = frog * 10;
                System.out.println(frog);
                frog = frog / 3.5;
                System.out.println(frog);
                frog = frog + 4;
                System.out.println(frog);

                var firstBoxer = 78.2;
                var secondBoxer = 82.7;
                var totalWeight = firstBoxer + secondBoxer;
                System.out.println(totalWeight + " кг");
                var differenceWeight = secondBoxer - firstBoxer;
                System.out.println("Разница в весе боксёров составляет " + differenceWeight + " кг" );

                var differenceWeight2 = (secondBoxer % firstBoxer ) ;
                System.out.println("Разница в весе боксёров составляет " + differenceWeight2 + " кг");


                var tottalHours = 640;
                var oneDay = 8;
                var totalWorkers = tottalHours / oneDay;
                System.out.println("Всего работников в компании - " + totalWorkers + " человек");


                var moreWorkkers = totalWorkers + 94;
                var moreHaurs = moreWorkkers * oneDay;
                System.out.println("Если в компании работате "+ moreWorkkers + " человек, то всего "+ moreHaurs + " часов работы может быть поделено между сотрудниками ");

                short bannanas= 200;
                System.out.println("Бананов " + bannanas + " кг");

                float sugar = 3;
                float OnePortion = sugar / 4;
                System.out.println("Одна порция сахара весит " + OnePortion + " кг");

                byte a = 127;
                short b = 32767;
                int c= 2147483647;
                long d= 1000000000;
                float e= 1;
                double f=1.0001;

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);

                double f1= 27.12;
                long d1= 987678965549L;
                double e1= 2.786;
                short b1= 569;
                short b2= -159;
                short b3= 27897;
                byte a1= 67;

                System.out.println(f1);
                System.out.println(d1);
                System.out.println(e1);
                System.out.println(b1);
                System.out.println(b2);
                System.out.println(b3);
                System.out.println(a1);

                byte Ljudmila = 23;
                byte Anna = 27;
                byte Ekaterina = 30;
                short paperTotal= 480;

                int student = Ljudmila + Anna + Ekaterina;
                int qualityPaperForOneStudent= paperTotal / student;

                System.out.println(Ljudmila);
                System.out.println(Anna);
                System.out.println(Ekaterina);
                System.out.println("Всего " + paperTotal+ " листов бумаги");
                System.out.println(student + " студентов");
                System.out.println("На каждого ученика рассчитано "+qualityPaperForOneStudent+" листов бумаги");


                byte machine= 16;
                byte time= 2;
                byte Time1= 20;
                byte Time2= 1;
                byte Time3= 3;
                byte Time4= 1;

                int time1= time * 60 * 20;
                int time2= time1 * 5 * 24;
                int time3= time2 * 3;
                int time4= time3 * 10;

                System.out.println("За "+Time1+ " минут"+" машина произведёт "+time1+" штук бутылок");
                System.out.println("За "+Time2+ " сутки" + " машина произведёт "+time2+" штук бутылок");
                System.out.println("За "+Time3+ " дня"+" машина произведёт "+time3+" штук бутылок");
                System.out.println("За "+Time4+ " месяц"+" машина произведёт "+time4+" штук бутылок");

                byte ColourTotal= 120;
                byte whiteColour= 2;
                byte brownColour= 4;

                byte TotalClass= 120/ (2+4);
                int TotalWhite = TotalClass * whiteColour;
                int TotalBrown = TotalClass * brownColour;



                System.out.println(TotalClass);
                System.out.println(TotalWhite);
                System.out.println("В школе, где "+ TotalClass+ " классов, нужно "+ TotalWhite+ " белой краски и "+TotalBrown+" банок коричневой краски");



                byte bananaQt= 5;
                byte bananaGr=80;
                int milkQt= 2;
                byte milkGr=105;
                byte creamQt= 2;
                byte creamGr=100;
                byte eggQt=4;
                byte eggGr= 70;

                int cocktailGr= bananaQt*bananaGr+milkQt*milkGr+creamQt*creamGr+eggQt*eggGr;
                float cocktailKg= cocktailGr/1000f;


                System.out.println(cocktailGr+ " грамм коктейля");
                System.out.println(cocktailKg+ " килограмм коктейля");

                byte needDown= 7;
                float stepOne= 0.25f;
                float stepTwo= 0.5f;

                float StepOne= needDown/stepOne;
                float StepTwo= needDown/stepTwo;

                System.out.println(StepOne+ " Дней потребуется, что бы сбросить "+ needDown+ " кг,если сбрасывать по "+stepOne+ " кг в день");
                System.out.println(StepTwo+ " Дней потребуется, что бы сбросить "+ needDown+ " кг,если сбрасывать по "+stepTwo+ " кг в день");

                int Masha= 67760;
                int Denis= 83690;
                int Kristina= 76230;
                float Up= 1.1f;
                byte Year=12;

                float MashaNew= Masha* Up;
                float DenisNew= Denis* Up;
                float KristinaNew= Kristina* Up;

                int MashaYearOld= Masha*Year;
                int DenisYearOld= Denis*Year;
                int KristinaYearOld= Kristina*Year;

                float MashaYearNew= MashaNew* Year;
                float DenisYearNew= DenisNew  *Year;
                float KristinaYearNew= KristinaNew* Year;

                float MashaDifference= MashaYearNew - MashaYearOld;
                float DenisDifference= DenisYearNew- DenisYearOld;
                float KristinaDifference= KristinaYearNew- KristinaYearOld;

                System.out.println(Masha);
                System.out.println(Denis);
                System.out.println(Kristina);

                System.out.println(MashaNew);
                System.out.println(DenisNew);
                System.out.println(KristinaNew);

                System.out.println(MashaYearOld);
                System.out.println(DenisYearOld);
                System.out.println(KristinaYearOld);

                System.out.println("Маша теперь получает "+MashaNew+ " рублей. Годовой доход вырос на "+MashaDifference+ " рублей");
                System.out.println("Денис теперь получает "+DenisNew+ " рублей. Годовой доход вырос на "+DenisDifference+ " рублей");
                System.out.println("Крестина теперь получает "+KristinaNew+ " рублей. Годовой доход вырос на "+KristinaDifference+ " рублей");















            }



}

