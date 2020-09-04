package day12.Task4;
/*
Доработать класс MusicBand из прошлого задания таким образом, чтобы в группу можно было добавлять и
удалять участников. Под участником понимается строка (String) с именем и фамилией. Реализовать метод
слияния групп, т.е. все участники группы А переходят в группу B (участники не могут находиться в двух
группах одновременно). Реализовать метод, выводящий список участников в консоль. Проверить состав групп
после слияния.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Bad Boys Blue", 1984, new ArrayList<>(Arrays.asList("" +
                "Тревор Тэйлор", "Джон МакИнерни")));
        MusicBand band2 = new MusicBand("The Black Eyed Peas", 1992, new ArrayList<>(Arrays.asList("" +
                "Fergie", "Taboo")));
        MusicBand band3 = new MusicBand("Nightwish", 1996, new ArrayList<>(Arrays.asList("" +
                "Туомас Холопайнен", "Эмппу Вуоринен", "Марко Хиетала")));
        MusicBand band4 = new MusicBand("Hollywood Undead", 2005, new ArrayList<>(Arrays.asList("" +
                "J-Dog", "Johnny 3 Tears", "Charlie Scene")));
        MusicBand band5 = new MusicBand("Far East Movement", 2003, new ArrayList<>(Arrays.asList("" +
                "Кевин Нишимура", "Джэймс Ро", "Чжэ Чон")));
        MusicBand band6 = new MusicBand("Papa Roach", 1993, new ArrayList<>(Arrays.asList("" +
                "Джекоби Шэддикс", "Джерри Хортон", "Тобин Эсперанс")));
        MusicBand band7 = new MusicBand("California Breed", 2013, new ArrayList<>(Arrays.asList("" +
                "Гленн Хьюз", "Эндрю Уотт", "Джоуи Кастильо")));
        MusicBand band8 = new MusicBand("Metallica", 1981, new ArrayList<>(Arrays.asList("" +
                "Джеймс Хэтфилд", "Ларс Ульрих", "Кирк Хэмметт")));
        MusicBand band9 = new MusicBand("Hey Violet", 2008, new ArrayList<>(Arrays.asList("" +
                "Ния Ловелис", "Рена Ловелис", "Кейси Морета")));
        MusicBand band10 = new MusicBand("Paradise Lost", 1988, new ArrayList<>(Arrays.asList("" +
                "Ник Холмс", "Грег Макинтош", "Аарон Аеди")));

        List<MusicBand> list = new ArrayList<>(Arrays.asList(band1, band2, band3, band4, band5, band6,
                band7, band8, band9, band10));


        band1.transfer(band2);
        band1.printBand();
        band2.printBand();

    }
}
