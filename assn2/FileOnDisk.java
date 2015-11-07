package proj2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FileOnDisk extends Object implements Comparable<FileOnDisk> {
	private String path;
	private long size;
	public FileOnDisk(String canonicalPath, long size) {
		File file = new File(canonicalPath);
		this.path = canonicalPath;
		this.size = size;
	}

	public String getPath() {
		return this.path;
	}

	public long size() {
		return this.size;
	}

	public int compareTo(FileOnDisk file) {
		return 1;
	}
}