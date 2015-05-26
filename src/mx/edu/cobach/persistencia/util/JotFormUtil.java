/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alex
 */
public class JotFormUtil {
    private static final String LLAVE_API = "bdc0a99efa371a40b22d2a82298dc8c9";
    
    public static JSONObject crearEncuesta(Map encuesta){
        JSONObject resultado = null;
        JotForm cliente = new JotForm(LLAVE_API);
        
        JSONObject respuesta = cliente.createForm(encuesta);
        try {
            System.out.println(respuesta.toString(3));
            resultado = respuesta.getJSONObject("content");
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public static JSONObject getEncuesta(long idEncuesta){
        JSONObject respuesta = null;
        JotForm cliente = new JotForm(LLAVE_API);
        
        try {
            respuesta = cliente.getForm(idEncuesta).getJSONObject("content");
            System.out.println(respuesta.toString(3));
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    public static void actualizarPregunta(long idEncuesta, int idPregunta, 
            String propiedad, String valor){
        JSONObject respuesta = null;
        JotForm cliente = new JotForm(LLAVE_API);
        
        try {
            HashMap<String, String> pregunta = new HashMap();
            pregunta.put(propiedad, valor);
            respuesta = cliente.editFormQuestion(idEncuesta, idPregunta, pregunta);
            System.out.println(respuesta.toString(3));
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getIdPregunta(long idEncuesta, String nombre){
        int resultado = -1;
        JotForm cliente = new JotForm(LLAVE_API);
        
        try {
            JSONObject respuesta = cliente.getFormQuestions(idEncuesta).getJSONObject("content");
            Iterator itr = respuesta.keys();
            while(itr.hasNext()){
                JSONObject objeto = respuesta.getJSONObject((String) itr.next());
                if(objeto.getString("name").equalsIgnoreCase(nombre)){
                    resultado = objeto.getInt("qid");
                    break;
                }
            }
            System.out.println(respuesta.toString(3));
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public static JSONArray getRespuestas(long idEncuesta){
        JSONArray respuesta = null;
        JotForm cliente = new JotForm(LLAVE_API);
        
        try {
            respuesta = cliente.getFormSubmissions(idEncuesta, "0", "100", null, "new")
                    .getJSONArray("content");
            System.out.println(respuesta.toString(3));
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public static JSONObject getPreguntas(long idEncuesta){
        JSONObject respuesta = null;
        
        JotForm cliente = new JotForm(LLAVE_API);
        try {
            respuesta = cliente.getFormQuestions(idEncuesta).getJSONObject("content");
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    public static JSONObject copiarEncuesta(long idEncuesta){
        JSONObject respuesta = null;
        
        JotForm cliente = new JotForm(LLAVE_API);
        
        try {
            respuesta = cliente.cloneForm(idEncuesta).getJSONObject("content");
        } catch (JSONException ex) {
            Logger.getLogger(JotFormUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
}
