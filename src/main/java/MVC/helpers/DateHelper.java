package MVC.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Carlos Zubiran on 5/16/2016.
 */
public class DateHelper extends CommonHelper{

    //region CUSTOM METHODS

    public static java.sql.Date utilDateToSqlDate(java.util.Date date) {

        return new java.sql.Date(date.getTime());

    }


    public static java.util.Date sqlDateToUtilDate(java.sql.Date date) {

        return new java.util.Date(date.getTime());

    }

    public static java.util.Date stringToUtilDate(String dateIn, String format) {

        DateFormat dateFormat = new SimpleDateFormat(format);
        java.util.Date dateOut = null;

        try {
            dateOut = dateFormat.parse(dateIn);
        } catch (ParseException parseEx) {
            logger.error(parseEx);
        }

        return dateOut;


    }

    //endregion CUSTOM METHODS


}
