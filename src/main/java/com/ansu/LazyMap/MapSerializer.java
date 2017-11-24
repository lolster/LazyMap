/**
 * Description: LazyMap implementation in Java
 * 
 * Authors:
 * Sushrith Arkal  (01FB14ECS262)
 * Varun Bharadwaj (01FB14ECS278)
 * Varun Majunath  (01FB14ECS280)
 * Suhas Kashyap   (01FB14ECS255)
 * 
 * Seventh Semester,
 * CSE Department,
 * PES University,
 * Bangalore, India
*/

package com.ansu.LazyMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MapSerializer {
	public static <T> void storeMap(Map<T> map, String filePath) {
		try {
			FileOutputStream fileOut = new FileOutputStream(filePath);
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(map);
	        out.close();
	        fileOut.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> Map<T> loadMap (String filePath) {
		Map<T> map = null;
		try {
	        FileInputStream fileIn = new FileInputStream(filePath);
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        map = (Map<T>)in.readObject();
	        in.close();
			fileIn.close();
			return map;
		} catch (IOException i) {
	        i.printStackTrace();
	        return null;
		}
		catch (ClassNotFoundException c) {
			c.printStackTrace();
			return null;
		}
	}
}
