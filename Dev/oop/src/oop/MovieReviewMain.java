package oop;


public class MovieReviewMain{
	public static void main(String[] args) {
		
		MovieReview[] movieReview = new MovieReview[2];
		
		movieReview[0] = new MovieReview();
		movieReview[1] = new MovieReview();
		
		movieReview[0].name = "데몬 헌터스";
		movieReview[1].name = "야당";
		movieReview[0].review = "나이불문 가족애니메이션";
		movieReview[1].review = "흥미진진 자극적인 소재";
		
		for (MovieReview i : movieReview) {
			System.out.println(i.name + " - "+ i.review);
		}
		
	}
}