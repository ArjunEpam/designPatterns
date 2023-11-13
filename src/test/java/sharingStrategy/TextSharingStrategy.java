package sharingStrategy;

public class TextSharingStrategy implements SharingStrategy {
    @Override
    public void share(String photo) {
        // Logic for sharing photo as text
        System.out.println("Sharing photo as text: " + photo);
    }
}
