public class Main {
    public static void main(String[] args) {
        // Creating a Youtube channel
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        // Creating subscribers
        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");
        Subscriber subscriber3 = new Subscriber("Charlie");

        // Subscribing the subscribers to the Youtube channel
        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.subscribe(subscriber3);

        // Notifying changes to subscribers
        youtubeChannel.notifyChanges();

        // Unsubscribing a subscriber
        youtubeChannel.unsubscribe(subscriber2);

        // Notifying changes again after unsubscribing
        youtubeChannel.notifyChanges();
    }
}