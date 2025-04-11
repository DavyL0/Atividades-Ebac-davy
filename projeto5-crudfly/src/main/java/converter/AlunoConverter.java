package converter;


import domain.Aluno;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: projeto5-crudfly
 * Package: converter
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 13:49
 * <p>
 */

@FacesConverter(forClass = Aluno.class)
public class AlunoConverter implements Converter {

    private static final String key = "converter.AlunoConverter";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s.isEmpty()) {
            return null;
        }
        return getViewMap(facesContext).get(s);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        String id = ((Aluno) o).getId().toString();
        getViewMap(facesContext).put(id, o);
        return id;
    }

    private Map<String, Object> getViewMap(FacesContext context) {
        Map<String, Object> viewMap = context.getViewRoot().getViewMap();
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Map<String, Object> idMap = (Map) viewMap.get(key);
        if (idMap == null) {
            idMap = new HashMap<String, Object>();
            viewMap.put(key, idMap);
        }
        return idMap;
    }


}
