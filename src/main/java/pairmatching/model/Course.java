package pairmatching.model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public enum Course {
	BACKEND("백엔드"),
	FRONTEND("프론트엔드");

	private String name;

	Course(String name) {
		this.name = name;
	}

	public static String courseNamesToString() {
		return Arrays.asList(values()).stream()
				.map(course -> course.name)
				.collect(Collectors.joining(" | "));
	}
}
