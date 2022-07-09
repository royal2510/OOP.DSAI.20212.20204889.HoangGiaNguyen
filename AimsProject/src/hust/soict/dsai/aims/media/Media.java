package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Media  {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = (Comparator<Media>) new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = (Comparator<Media>) new MediaComparatorByCostTitle();
	
	private LocalDate dateAdded;
	protected int id;
	protected String title; 
	protected String category;  
	protected float cost;
	private String director;
	private int length;
	private List<String> authors;
	protected static int nbMedia = 0;
	
	public boolean equals(Object o) {
		if(o instanceof Media) {
			Media that = (Media) o;
			return this.id == that.getId();
		}
		else return false;
	}
	
	public int compareTo(Media obj) {
		if (this.getTitle().compareTo(obj.getTitle()) == 0) {			
			return (this.getCategory().compareTo(obj.getCategory()));
		}
		else {
			return (this.getTitle().compareTo(obj.getTitle()));
		}
	}

	public Media(String title, String category, float cost) {
		this.id = nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbMedia ++;
	}
	
	public Media(String title) {
		this.id = nbMedia;
		this.title = title;
		nbMedia ++;
	}

	public Media(String title, String category,String director, int length, float cost) {
		this.id = nbMedia;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbMedia++;
	}
	
	public Media(String title, String category, String director, float cost,int length ,String artist) {
		
		this.id = nbMedia;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.length = length;
		nbMedia++;
	}
	
	public Media(String title, String category, float cost, List<String> authors) {
		this.id = nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
		nbMedia++;
	}
	
	
	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void play() {
	}

}

