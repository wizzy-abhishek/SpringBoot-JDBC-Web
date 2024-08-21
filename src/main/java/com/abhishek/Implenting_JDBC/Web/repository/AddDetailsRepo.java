package com.abhishek.Implenting_JDBC.Web.repository;

import com.abhishek.Implenting_JDBC.Web.pojo.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddDetailsRepo {

    private JdbcTemplate jdbcTemplate ;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        System.out.println("JDBC template setter called from Repo ");
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Alien alien) {
        String sql = "INSERT INTO alien(name, mobile) VALUES (?, ?)";
        System.out.println("Repo class also worked, executing query");
        int isSaved = jdbcTemplate.update(sql, alien.getName(), alien.getMobile());
        if (isSaved == 1) {
            return 1;
        }
        return 0;
    }


   /* public Alien fetch(String mobile) {
        String sql = "SELECT * FROM alien WHERE mobile = " + mobile ;
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Alien fetchedAlien = new Alien();
            fetchedAlien.setName(rs.getString("name"));
            fetchedAlien.setMobile(rs.getString("mobile"));
            return fetchedAlien;
        });
    }*/
}
