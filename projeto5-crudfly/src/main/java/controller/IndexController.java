package controller;

import jakarta.faces.context.FacesContext;

import java.util.Map;

/**
 * Project: projeto5-crudfly
 * Package: controller
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 13:50
 * <p>
 */
public class IndexController {
    private static final long serialVersionUID = -784519597996507487L;

    public String redirectCliente() {
        return "/cliente/list.xhtml";
    }

    public String redirectProduto() {
        return "/produto/list.xhtml";
    }

    public String redirectVenda() {
        return "/venda/list.xhtml";
    }

    public String redirectVendaProd() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Map<String, String> requestParams = facesContext.getExternalContext().getRequestParameterMap();
        String prodNome = requestParams.get("prodNome");


        return "venda.xhtml?faces-redirect=true";
    }
}
