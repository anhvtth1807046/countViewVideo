import enity.Video;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        List<Video> videos = new ArrayList<Video>();
        HashMap<String, Video>  map = new HashMap<String, Video>();
        FileReader fileReader = new FileReader("src/main/resources/TomandJerry.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
//            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                String view = splitted[3];
//                System.out.println("day: " + day);
//                System.out.println("id: " + id);
//                System.out.println("title: " + title);
//                System.out.println("view: " + view);
                videos.add(new Video(id, title, day, Integer.parseInt(view)));
            }
            count++;
        }

        for (Video v : videos) {
            int countView = 0;
            if (map.containsKey(v.getId())){
                Video videoTemp = map.get(v.getId());
                countView = videoTemp.getCountView();
            }
            countView += v.getCountView();

            Video video = new Video(v.getId(), v.getTitle(), v.getDay(), countView);
            map.put(v.getId(), video);
        }

        for (String id : map.keySet()){
            Video v = map.get(id);
            System.out.println(v.toString());
        }

    }
}


