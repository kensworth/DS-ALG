package trees;
// represents single tree
import java.io.*;

public class Tree {
	private String id;
	private String street;
	private String cs1;
	private String cs2;
	private String condition;
	private String diameter;
	private String code;
	private String borough;
	private String zip;

	public Tree(String id, String street, String cs1, String cs2, String condition, String diameter, String code, String borough, String zip) {
		this.id = id;
		this.street = street;
		this.cs1 = cs1;
		this.cs2 = cs2;
		this.condition = condition;
		this.diameter = diameter;
		this.code = code;
		this.borough = borough;
		this.zip = zip;
	}
	public String id() {
		return this.id;
	}
	public String street() {
		return this.street;
	}
	public String cs1() {
		return this.cs1;
	}
	public String cs2() {
		return this.cs2;
	}
	public String condition() {
		return this.condition;
	}
	public String diameter() {
		return this.diameter;
	}
	public String code() {
		return this.code;
	}
	public String borough() {
		return this.borough;
	}
	public String zip() {
		return this.zip;
	}
}