//1306180137


public class MakingPassword {

    MakingPassword(int number) {

        int onesDigit, tensDigit, hundredsDigit, thousandsDigit;
        int newOnesDigit, newTensDigit, newHundredsDigit, newThousandsDigit;

        onesDigit = number - ((number / 10) * 10);
        newOnesDigit = (onesDigit + 6) % 10;
        number = number / 10;

        tensDigit = number - ((number / 10) * 10);
        newTensDigit = (tensDigit + 6) % 10;
        number = number / 10;

        hundredsDigit = number - ((number / 10) * 10);
        newHundredsDigit = (hundredsDigit + 6) % 10;
        number = number / 10;

        thousandsDigit = number;
        newThousandsDigit = (thousandsDigit + 6) % 10;

        int temp = 0;//This variable is used to change the values ​​of other variables within itself.
        temp = newOnesDigit;
        newOnesDigit = newHundredsDigit;
        newHundredsDigit = temp;
        temp = 0;

        temp = newTensDigit;
        newTensDigit = newThousandsDigit;
        newThousandsDigit = temp;
        temp = 0;
        System.out.println("New data is: " + newThousandsDigit + newHundredsDigit + newTensDigit + newOnesDigit);
    }
}
