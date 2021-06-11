package com.mandeep.hackerrank.twodArray;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * INPUT
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
expected output 19
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
expected output 0

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
 expect 7
 
-9 -9 -9 0 0 0
0 -9 0 0 0 0
-9 -9 -9 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 9
 expect 7
 */
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream
						.of(bufferedReader.readLine().replaceAll("\\s+$", "")
								.split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		List<Integer> whatToSum = new ArrayList<>();
		List<Integer> containerSums = new ArrayList<>();
		int i = 0;
		int size = arr.size();
		while (i < size - 2) {
			List<Integer> rowOne = arr.get(i);
			List<Integer> rowTwo = arr.get(i + 1);
			List<Integer> rowThree = arr.get(i + 2);

			int j = 0;
			int z = 1;
			while (j < size - 2) {
				whatToSum.add(rowOne.get(j));
				whatToSum.add(rowOne.get(j + 1));
				whatToSum.add(rowOne.get(j + 2));
				// row two elements
				whatToSum.add(rowTwo.get(z));
				whatToSum.add(rowThree.get(j));
				whatToSum.add(rowThree.get(j + 1));
				whatToSum.add(rowThree.get(j + 2));
				j++;
				z++;
				// add the array
				Integer sum = whatToSum.stream().reduce(0, (a, b) -> {
					return a + b;
				});
				System.out.println(whatToSum);
				containerSums.add(sum);
				whatToSum.removeAll(whatToSum);
			}
			i++;
		}
		containerSums.stream().distinct().sorted(Collections.reverseOrder())
				.limit(1).forEach(e -> System.out.println(e));

	}
}
