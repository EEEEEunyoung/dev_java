package dev_java.Semi.login.oracle.login;

// 네이버 검색 API 예제 - 블로그검색 

///파싱해줄 성민오빠 구함~~~

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//import org.json.simple.JSONArray;

public class NaverConnect {

  NaverConnect() {
  }

  public static void main(String[] args) {
    String clientId = "8MVmqhDdydQc37JR89Zm"; // 애플리케이션 클라이언트 아이디
    String clientSecret = "lTO9ptwKR8"; // 애플리케이션 클라이언트 시크릿
    String word = null;
    String text = null;

    SearchMainForm sf = new SearchMainForm();

    try {
      word = sf.searchTextField.getText();
      text = URLEncoder.encode(word, "UTF-8");
      System.out.println("꺄ㅑ꺆꺄");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException("검색어 인코딩 실패", e);
    }

    String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text; // JSON 결과
    // String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text;
    // // XML 결과

    Map<String, String> requestHeaders = new HashMap<>();
    requestHeaders.put("X-Naver-Client-Id", clientId);
    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
    String responseBody = get(apiURL, requestHeaders);

    System.out.println(responseBody);

  }

  private static String get(String apiUrl, Map<String, String> requestHeaders) {
    HttpURLConnection con = connect(apiUrl);
    try {
      con.setRequestMethod("GET");
      for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
        con.setRequestProperty(header.getKey(), header.getValue());
      }

      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
        return readBody(con.getInputStream());
      } else { // 오류 발생
        return readBody(con.getErrorStream());
      }
    } catch (IOException e) {
      throw new RuntimeException("API 요청과 응답 실패", e);
    } finally {
      con.disconnect();
    }
  }

  private static HttpURLConnection connect(String apiUrl) {
    try {
      URL url = new URL(apiUrl);
      return (HttpURLConnection) url.openConnection();
    } catch (MalformedURLException e) {
      throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
    } catch (IOException e) {
      throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
    }
  }

  private static String readBody(InputStream body) {
    InputStreamReader streamReader = new InputStreamReader(body);

    try (BufferedReader lineReader = new BufferedReader(streamReader)) {
      StringBuilder responseBody = new StringBuilder();

      String line;
      while ((line = lineReader.readLine()) != null) {
        responseBody.append(line);
      }

      return responseBody.toString();
    } catch (IOException e) {
      throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
    }

  } // main
}
