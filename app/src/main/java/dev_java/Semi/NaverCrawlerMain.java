package dev_java.Semi;

import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.Flow.Subscription;

public class NaverCrawlerMain {
  public static void main(String[] args) {

    String id = "pW6gMRMwLM1fFjOfFoeK";
    String secret = "v0ezCWbMbF";

    try {
      NaverCrawler nc = new NaverCrawler();

      String url = URLEncoder.encode("java", "UTF-8");
      String response = nc.search(id, secret, url);

      System.out.println(response);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
