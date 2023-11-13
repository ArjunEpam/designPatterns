package sharingStrategy;

public class SocialMediaSharingStrategy implements SharingStrategy {
    private String socialMedia;

    public SocialMediaSharingStrategy(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public void share(String photo) {
        // Logic for sharing photo on the specified social media
        System.out.println("Sharing photo on " + socialMedia + ": " + photo);
    }
}
