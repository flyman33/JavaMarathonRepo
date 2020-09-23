package SeaBattle;

import java.io.IOException;
import java.util.Arrays;

public class Field {
    private Unit[][] battleField;

    public Field(Unit[][] field) {
        battleField = field;
        fill();
    }

    public void fill() {
        for(int i = 0; i < battleField.length; i++) {
            for(int j = 0; j < battleField.length; j++) {
                if(battleField[i][j] == null) {
                    battleField[i][j] = Unit.EMPTY;
                }
            }
        }
    }

    public Unit[][] getBattleField() {
        return battleField;
    }

    public void setBattleField(Unit[][] battleField) {
        this.battleField = battleField;
    }

    public void set(int[][] arr, Unit s) throws IOException {

       int iValue = arr[0][0];
       int jValue = arr[0][1];

        for(int i = 0; i < arr.length; i++) { //Идем по массиву arr
            for(int j = 0; j < arr[i].length - 1; j++) { //Координата 0, 1 соответствует записи: [arr[i][j]][arr[i][j + 1]
                if(battleField[arr[i][j]][arr[i][j + 1]] == Unit.EMPTY) { //Проверяем, если ячейка пустая, то ложим туда координаты корабля

                //Если корабль располагается горизонтально не у края
                    if(arr[i][j] > 0 && arr[i][j + 1] > 0 && arr[i][j] < 9 && arr[i][j + 1] < 9) {
                        if(arr.length > 1 && arr[0][0] == arr[1][0] || arr.length == 1) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO; // Ореол сверху
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO; //Ореол снизу
                            //Окружаем "голову" корабля ореолами
                            if(i == 0) {
                                if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                    battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;  //Ореол слева
                                if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO; //Ореол слева-сверхупо диагонали
                                if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO; //Ореол слева-снизу по диагонали
                            }
                            //Окружаем "хвост" корабля ореолами
                            if(i == arr.length - 1) {
                                if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;  //Ореол справа
                                if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO; //Ореол справа-сверху по диагонали
                                if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO; //Ореол справа-снизу по диагонали
                            }
                        }
                        //Если корабль располагается вертикально не у края
                        else if(arr[0][1] == arr[1][1]) {
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO; // Ореол слева
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO; // Ореол справа
                            if(i == 0) {
                                if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;  //Ореол сверху
                                if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO;   //Ореол слева-сверху по диагонали
                                if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;   //Ореол справа-сверху по диагонали
                            }

                            if(i == arr.length - 1) {
                                if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;  //Ореол снизу
                                if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO; //Ореол слева-снизу по диагонали
                                if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO; //Ореол справа-снизу по диагонали
                            }
                        }

                    }
                    //Левый край без углов
                    if(arr[i][j] > 0 && arr[i][j] < 9 && arr[i][j + 1] == 0) {

                        if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                            battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;

                        if(i == 0) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                        }

                        if(i == arr.length - 1) {
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                        }

                        if(arr.length == 1) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                        }


                    }

                    //Правый край без углов
                    if(arr[i][j] > 0 && arr[i][j] < 9 && arr[i][j + 1] == 9) {

                        if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                            battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;

                        if(i == 0) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                        }

                        if(i == arr.length - 1) {
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                        }

                        if(arr.length == 1) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                        }


                    }

                    //Верхний край без углов
                    if(arr[i][j] == 0 && arr[i][j + 1] > 0 && arr[i][j + 1] < 9) {

                        if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                            battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;

                        if(i == 0) {
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                        }

                        if(i == arr.length - 1) {
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                        }

                        if(arr.length == 1) {
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                        }


                    }

                    //Нижний край без углов
                    if(arr[i][j] == 9 && arr[i][j + 1] > 0 && arr[i][j + 1] < 9) {

                        if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                            battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;

                        if(i == 0) {
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                        }

                        if(i == arr.length - 1) {
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                        }

                        if(arr.length == 1) {
                            if(battleField[arr[i][j]][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] - 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] - 1] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;
                            if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                        }


                    }

                    if(arr[i][j] == 0 && arr[i][j + 1] > 0) {
                        if(arr.length > 1 && arr[i][j] == iValue || arr.length == 1) {
                            if(battleField[arr[i][j] - 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] - 1][arr[i][j + 1]] = Unit.HALO;
                            if(battleField[arr[i][j] + 1][arr[i][j + 1]] == Unit.EMPTY)
                                battleField[arr[i][j] + 1][arr[i][j + 1]] = Unit.HALO;
                            if(i == arr.length - 1) {
                                if(battleField[arr[i][j] - 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] - 1][arr[i][j + 1] + 1] = Unit.HALO;
                                if(battleField[arr[i][j]][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j]][arr[i][j + 1] + 1] = Unit.HALO;
                                if(battleField[arr[i][j] + 1][arr[i][j + 1] + 1] == Unit.EMPTY)
                                    battleField[arr[i][j] + 1][arr[i][j + 1] + 1] = Unit.HALO;
                            }
                        }
                    }




                    battleField[arr[i][j]][arr[i][j + 1]] = s;


                } else
                    throw new IOException("Невозможно разместить корабль. Место занято.");
            }
        }

        print();
    }

    public void print() {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[i][j].getImage() + "\t");
            }
            System.out.println();
        }
    }
}
