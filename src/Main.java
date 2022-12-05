import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        createMenu();
        ArrayList<News> list = new ArrayList<News>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Number of news : ");
                    int numberNews = scanner.nextInt();
                    scanner.nextLine();
                    News news = new News();
                    for (int i = 0; i < numberNews; i++) {


                        System.out.println("Title: ");
                        String title = scanner.nextLine();
                        news.setTitle(title);

                        System.out.println("PublishDate: ");
                        String publishDate = scanner.nextLine();
                        news.setPublishDate(publishDate);

                        System.out.println("Author: ");
                        String author = scanner.nextLine();
                        news.setAuthor(author);

                        System.out.println("content: ");
                        String content = scanner.nextLine();
                        news.setContent(content);

                        System.out.println("rate: ");
                        for (int j = 0; j < 3; j++) {
                            int rate = scanner.nextInt();
                            news.rateList.add(rate);
                            scanner.nextLine();
                        }
                        list.add(news);
                    }
                    checkExit();
                    if (scanner.nextInt() == 0) {
                        createMenu();
                        break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("Title: " + list.get(i).getTitle());
                        System.out.println("PublishDate: " + list.get(i).getPublishDate());
                        System.out.println("Author: " + list.get(i).getAuthor());
                        System.out.println("content:" + list.get(i).getContent());
                        System.out.println("----------");
                    }
                    checkExit();
                    if (scanner.nextInt() == 0) {
                        createMenu();
                        break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).caculate();
                        list.get(i).display();
                        System.out.println("----------");
                    }
                    checkExit();
                    if (scanner.nextInt() == 0) {
                        createMenu();
                        break;
                    }
                    break;
                case 4:
                    exit = true;
                    break;
            }
            if(exit == true)
                break;
        }
    }
    public static void createMenu(){
        System.out.println("-----------------------------");
        System.out.println("Choose one:");
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        System.out.println("-----------------------------");
    }
    public static void checkExit(){
        System.out.println("-----------------------------");
        System.out.println("Press 0 to exist");
    }
}