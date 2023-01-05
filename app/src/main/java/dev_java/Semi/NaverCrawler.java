package dev_java.Semi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;

public class NaverCrawler {

  final String baseUrl = "https://openapi.naver.com/v1/search/bolg?query=";
  String clientId = "pW6gMRMwLM1fFjOfFoeK";
  String secret = "v0ezCWbMbF";

  public String search(String clientId, String secret, String _url) {
    HttpURLConnection con = null;
    String result = "";
    try {
      URL url = new URL(baseUrl + _url);
      con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("Get");
      con.setRequestProperty("X-Naver_Client-id", clientId);
      con.setRequestProperty("X-Naver_Client-Secret", secret);

      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK)
        result = readyBody(con.getInputStream());
      else
        result = readyBody(con.getErrorStream());
    } catch (Exception e) {
      System.out.println("연결오류 :" + e);
    } finally {
      con.disconnect();
    }
    return result;
  }

  public String readyBody(InputStream body) {
    InputStreamReader streamReader = new InputStreamReader(body);

    try (BufferedReader lineReader = new BufferedReader(streamReader)) {
      StringBuilder responseBody = new StringBuilder();

      String line;
      while ((line = lineReader.readLine()) != null) {
        responseBody.append(line);
      }

      return responseBody.toString();
    } catch (IOException e) {
      throw new RuntimeException("API 응답 읽기 실패", e);
    }
  }
}
