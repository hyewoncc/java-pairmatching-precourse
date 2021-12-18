package pairmatching.model;

import java.util.Arrays;
import java.util.List;

public enum Level {
	LEVEL1("레벨1"),
	LEVEL2("레벨2"),
	LEVEL3("레벨3"),
	LEVEL4("레벨4"),
	LEVEL5("레벨5");

	private String name;

	Level(String name) {
		this.name = name;
	}

	public static List<Level> getLevels() {
		return Arrays.asList(values());
	}

	public String getName() {
		return name;
	}
}
