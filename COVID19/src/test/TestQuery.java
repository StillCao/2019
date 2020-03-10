package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.QueryData;
import domain.Community_Wuhan;
import domain.Country;
import domain.News;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestQuery {

    @Test
    public void testQueryCountry(){
        List<Country> ncp_country = new QueryData().quaryCountry();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(ncp_country);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testNews(){
        List<News> news = new QueryData().quaryNews();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(news);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCommunity(){
        List<Community_Wuhan> community_wuhans = new QueryData().quaryCommunity();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(community_wuhans);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}

