import sun.util.resources.cldr.nus.CalendarData_nus_SD;

public class STATS {

    public static int _NUMENEMIES = 3;

    public static int _FIRERATE = 3;

    public static int _EMOVEMENT = 3;

    public static int _LEVEL = 0;

    public static void setupLevel(){

        /*switch(_LEVEL){

            case 0:
                _NUMENEMIES = 3;
                _FIRERATE = 3;
                _EMOVEMENT = 3;
                break;

            case 1:
                _NUMENEMIES = 4;
                _FIRERATE = 12;
                _EMOVEMENT = 4;
                break;

            default: break;
        }*/

        _NUMENEMIES++;
        _FIRERATE+=9;
        _EMOVEMENT++;
    }

    public static void increaseLevel(){

        _LEVEL++;
        setupLevel();
    }


}
