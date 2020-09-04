package day12.Task3;
/*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
(название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand , добавить их в список
(выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
Перемешать список. Создать второй список, в который скопировать группы из первого списка,
основанные после 2000 года. Вывести в консоль оба списка.
 */

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Bad Boys Blue", 1984);
        MusicBand band2 = new MusicBand("The Black Eyed Peas", 1992);
        MusicBand band3 = new MusicBand("Nightwish", 1996);
        MusicBand band4 = new MusicBand("Hollywood Undead", 2005);
        MusicBand band5 = new MusicBand("Far East Movement", 2003);
        MusicBand band6 = new MusicBand("Papa Roach", 1993);
        MusicBand band7 = new MusicBand("California Breed", 2013);
        MusicBand band8 = new MusicBand("Metallica", 1981);
        MusicBand band9 = new MusicBand("Hey Violet", 2008);
        MusicBand band10 = new MusicBand("Paradise Lost", 1988);

        List<MusicBand> list = new ArrayList<>(Arrays.asList(band1, band2, band3, band4, band5, band6,
                band7, band8, band9, band10));

        Collections.shuffle(list);

        List<MusicBand> list2 = new ArrayList<>();

        for(MusicBand m : list) {
            if(m.getYear() > 2000)
                list2.add(m);
       }

        System.out.println(list);
        System.out.println(list2);
    }
}
