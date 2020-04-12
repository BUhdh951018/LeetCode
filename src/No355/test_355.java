package No355;

import java.util.List;

public class test_355 {
    public static void main(String[] args) {
        Twitter obj = new Twitter();
        obj.postTweet(1, 5);
        System.out.println(obj.getNewsFeed(1));
        obj.follow(1, 2);
        obj.postTweet(2, 6);
        System.out.println(obj.getNewsFeed(1));
        obj.unfollow(1, 2);
        System.out.println(obj.getNewsFeed(1));
    }
}
