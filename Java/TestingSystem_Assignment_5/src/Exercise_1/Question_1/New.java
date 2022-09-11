package Exercise_1.Question_1;

public class New implements INew {

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	@Override
	public void Display() {
		System.out.println("Title la: " + title);
		System.out.println("PublishDate la: " + publishDate);
		System.out.println("Author la: " + author);
		System.out.println("Content la: " + content);
		System.out.println("AverageRate la: " + averageRate);

	}

	@Override
	public float Calculate(int[] rates) {
		this.averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;
		return this.averageRate;
	}

}
