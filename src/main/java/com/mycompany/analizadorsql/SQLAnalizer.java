/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author avbravo
 */
public class SQLAnalizer {
    public Boolean validSQL(String sql){
         Boolean isValid = Boolean.FALSE;
        try {
            final String regex = "^(INSERT INTO|UPDATE|SELECT|WITH|DELETE)(?:[^;']|(?:'[^']+'))+;\\s*$";
final Pattern p = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
        /**
         * field : @parameter
         * field : 'value'
         * and
         * or
         * not
         * <
         * >
         * != 
         * ==
         * between (field
         * (  )
         * (  ) and or not ( )
         */    
Summary summary = new Summary();

         
        } catch (Exception e) {
            System.out.println("validSQL()"+e.getLocalizedMessage());
        }
        
        return isValid;
        
    }
    
    private Summary sintacAnalizer(String sql){
        Summary summary = new Summary();
        try {
            long parentesisOpen = sql.chars().filter(ch -> ch == '(').count();
            long parentesisClosed = sql.chars().filter(ch -> ch == ')').count();
            long equalsCount = sql.chars().filter(ch -> ch == '=').count();
            long arrobaCount = sql.chars().filter(ch -> ch == '@').count();
            int andCount = StringUtils.countMatches(sql, "and");
            int orCount = StringUtils.countMatches(sql, "or");
            int notCount = StringUtils.countMatches(sql, "not");
            
            
             StringBuilder message = new StringBuilder(site_name).append(" is a ").append(String.valueOf(type)).append(" Portal");
        } catch (Exception e) {
            System.out.println("sintacAnalizer() "+e.getLocalizedMessage());
        }
        return summary;
    }
}
