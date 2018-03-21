/**
 * 
 */
package com.sixt.platform.interview.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author TTTDEMIRCI
 *
 */
public class DependencyFinder {

	public static List<Integer> getDependencies(int id) {

		List<Integer> retList = new ArrayList<>();
		Scanner scan = null;
		try {
			scan = new Scanner(new File("Scripts.txt"));
			while (scan.hasNext()) {
				String curLine = scan.nextLine();
				String[] splitted = curLine.split(" ");
				if (splitted != null && splitted.length > 1) {
					if (Integer.valueOf(splitted[0]) == id) {
						for (int i = 1; i < splitted.length; i++) {
							retList.add(Integer.valueOf(splitted[i]));
						}
						break;
					}

				}

			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			scan.close();
		}
		return retList;

	}

}
