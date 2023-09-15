package View;

import Common.Validate;
import Controller.Controller;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int choice = Controller.menu();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    Controller.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    Controller.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    Controller.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}