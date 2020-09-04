package day12.Task5;
/*
Требования поменялись - теперь у участника музыкальной группы есть не только имя, но и возраст.
Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса, с новым именем)
таким образом, чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое,
что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния. Методы для слияния
и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса
MusicArtist.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Bad Boys Blue", 1984,
                new ArrayList<>(Arrays.asList(new MusicArtists("Тревор Тэйлор", 34),
                        new MusicArtists("Джон МакИнерни", 35 ))));

        MusicBand band2 = new MusicBand("The Black Eyed Peas", 1992,
                new ArrayList<>(Arrays.asList(new MusicArtists("Fergie", 36),
                        new MusicArtists("Taboo", 45 ))));

        MusicBand band3 = new MusicBand("Nightwish", 1996,
                new ArrayList<>(Arrays.asList(new MusicArtists("Туомас Холопайнен", 36),
                        new MusicArtists("Эмппу Вуоринен", 40 ),
                        new MusicArtists("Марко Хиетала", 40 ))));


        band1.transfer(band2);
        band1.printBand();
        band2.printBand();
    }
}
