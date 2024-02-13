package com.miit.spring.model;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;     
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper; 

public class RegisterDao1{

	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}  
	public List<User> getEmployees(){    
	    return template.query("select * from users",new RowMapper<User>(){    
	        public User mapRow(ResultSet rs, int row) throws SQLException {    
	            User e=new User();    
	            e.setID(rs.getInt(1));    
	            e.setUserName(rs.getString(5));   
	            e.setPassword(rs.getString(4));     
	            return e;    
	        }    
	    });    
	}   
}
