package main;

import entity.TotalViews;
import entity.Video;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/main/resources/Tom&Jerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        ArrayList<Video> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                double view = Double.parseDouble(splitted[3]);
                Video vd = new Video(day, id, title, view);
                list.add(vd);
            }
            count++;
        }
        HashMap<String, TotalViews> statistic = new HashMap<>();
        for (Video t : list
        ) {
            double ViewsCount = 0;
            if (statistic.containsKey(t.getId())) {
                TotalViews viewCount = statistic.get(t.getId());
                ViewsCount = viewCount.getView();
            }
            ViewsCount += t.getView();
            TotalViews viewCount = new TotalViews(t.getId(), t.getTitle(), ViewsCount);
            statistic.put(t.getId(), viewCount);
        }
        for (String id : statistic.keySet()
        ) {
            System.out.println(id);
            TotalViews viewCount = statistic.get(id);
            System.out.println(viewCount.getTitle());
            System.out.println(viewCount.getView());
        }

    }
}
