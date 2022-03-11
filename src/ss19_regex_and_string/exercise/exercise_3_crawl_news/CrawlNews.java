package ss19_regex_and_string.exercise.exercise_3_crawl_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
//            System.out.println(content);
            // regex
//            Pattern p = Pattern.compile("the-gioi/cang-thang-nga-ukraine.htm\">(.*?)</a>");
//            <a data-content-name="category-timeline_page_1" data-content-piece="category-timeline_page_1-position_5" data-content-target="/the-gioi/anh-ve-tinh-he-lo-chien-thuat-ukraine-cam-chan-luc-luong-nga-ap-sat-kiev-20220311082137392.htm" data-track-content="" href="
//            Pattern p = Pattern.compile("data-track-content=\"\" href=\"/the-gioi/\\w+(-\\w*)*\\d+\\.htm\"> <img(.*?)alt=\"(.*?)\"(.*?)\">(.*?)</a>");
//            Pattern p = Pattern.compile("data-track-content=\"\" href=\"/the-gioi/(.*?)\\.htm\"> <img(.*?)alt=\"(.*?)\"(.*?)\">(.*?)</a>");
            Pattern p = Pattern.compile("data-track-content=\"\" href=\"(.*?)alt=\"(.*?)\"(.*?)\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
