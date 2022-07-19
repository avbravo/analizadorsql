/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author avbravo
 */
public class SQLAnalizer {

    public Boolean validSQL(String sql) {
        Boolean isValid = Boolean.FALSE;
        try {
            final String regex = "^(INSERT INTO|UPDATE|SELECT|WITH|DELETE)(?:[^;']|(?:'[^']+'))+;\\s*$";
            final Pattern p = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
            /**
             * field : @parameter field : 'value' and or not
             * <
             * >
             * != == between (field ( ) ( ) and or not ( )
             */
            Summary summary = new Summary();

        } catch (Exception e) {
            System.out.println("validSQL()" + e.getLocalizedMessage());
        }

        return isValid;

    }

    public Summary count(String sql, List<String> tokens) {
        Summary summary = new Summary();
        try {
//            long parentesisOpen = sql.chars().filter(ch -> ch == '(').count();
//            long parentesisClosed = sql.chars().filter(ch -> ch == ')').count();
//            long equalsCount = sql.chars().filter(ch -> ch == '=').count();
//            long arrobaCount = sql.chars().filter(ch -> ch == '@').count();
            int open = StringUtils.countMatches(sql, "(");
            int close = StringUtils.countMatches(sql, ")");
            int equalsSimbol = StringUtils.countMatches(sql, "=");
            int arrobaSimbol = StringUtils.countMatches(sql, "@");
            int between = StringUtils.countMatches(sql, "between");
            int comillaSimbol = StringUtils.countMatches(sql, "'");
            int andCount = StringUtils.countMatches(sql, "and");
            int orCount = StringUtils.countMatches(sql, "or");
            int notCount = StringUtils.countMatches(sql, "not");
            
             /**
             * Recorre los tokens
             */
          
        
          
            summary = new Summary(open, close, equalsSimbol, arrobaSimbol, between, comillaSimbol, notCount, andCount, orCount);

           

            //  String
            //  StringBuilder message = new StringBuilder(site_name).append(" is a ").append(String.valueOf(type)).append(" Portal");
        } catch (Exception e) {
            System.out.println("sintacAnalizer() " + e.getLocalizedMessage());
        }
        return summary;
    }

    public SQLAnalizer() {
    }

    public List<String> getTokensWithCollection(String str, String separator) {
        return Collections.list(new StringTokenizer(str, separator)).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }
    /*
    Obtiene los campos
    */
    
    public List<String> getFields(List<String> tokens) {
   List<String> result = tokens.stream()                // convert list to stream
                .filter(line -> line.indexOf('@')!= -1 && Character.isAlphabetic(line.charAt(0)))     // we dont like mkyong
                .collect(Collectors.toList());      
   return result;
    }
}
