package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생인 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MovieReview[] movies = new MovieReview[]{movie1, movie2};

        for(int i=0; i<movies.length; i++) {
            System.out.println("영화 제목: " + movies[i].title + ", 리뷰: " + movies[i].review);
        }


    }
}
