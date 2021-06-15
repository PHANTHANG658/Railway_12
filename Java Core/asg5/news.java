package tesystem6;

public class news  implements INEews{
	private int id;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	private float AverageRate;
    int Rate;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public float getAverageRate() {
		return AverageRate;
	}

	@Override
	public void Display() {
		System.out.println("in ra Title "+Title+" PublishDate:"+ PublishDate+"Author"+Author+"Content"+Content+"AverageRate"+AverageRate);
		
	}

	@Override
	public float Calculate() {
		int[] rate = new int[3];
		 AverageRate= (rate[0]+rate[1]+rate[2])/3;
		
		
		return  AverageRate;
	}

}
