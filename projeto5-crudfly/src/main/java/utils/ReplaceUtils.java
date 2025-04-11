package utils;

/**
 * Project: projeto5-crudfly
 * Package: utils
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 14:20
 * <p>
 */
public class ReplaceUtils {
    public static String replace(String value, String ...patterns) {
        String retorno = value;
        for (String pattern : patterns) {
            retorno = retorno.replace(pattern, "");
        }
        return retorno;
    }
}
