package com.lawencon.kalkulatormatrix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Galih Dika
 *
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer[][]> matrix = new ArrayList<Integer[][]>();
		int kolom1;
		int kolom2;
		int inputMatrix;
		System.out.println("Masukan jumlah Matrix yang dimau :");
		inputMatrix = input.nextInt();
		System.out.println("Masukan jumlah kolom yang dimau :");
		kolom1 = input.nextInt();
		System.out.println("Masukan jumlah baris yang dimau :");
		kolom2 = input.nextInt();
		Integer[][] matrix1 = new Integer[kolom1][kolom2];
		int[][] matrix2 = new int[kolom1][kolom2];
		int[][] hasil = new int[kolom1][kolom2];
		for (int h = 0; h < inputMatrix; h++) {
			System.out.println("Inputan matrix ke " + (h + 1));
			for (int i = 0; i < kolom1; i++) {
				for (int j = 0; j < kolom2; j++) {
					System.out.println("Masukan index ke " + i + j);
					int isi = input.nextInt();
					matrix1[i][j] = isi;
				}
			}
			matrix.add(matrix1);
		}
		for (Integer i = 0; i < matrix.size(); i++) {
			System.out.println("Matrix ke " + (i + 1));
			for (Integer j = 0; j < kolom1; j++) {
				for (Integer j2 = 0; j2 < kolom2; j2++) {
					System.out.print(matrix.get(i)[j][j2] + "\t");
				}
				System.out.println();
			}
		}
//		Integer[][] c = new Integer[kolom1][kolom2];
//		Integer[][] c = new Integer[kolom1][kolom2];
		System.out.println("Hasil penjumlahan");
		for (Integer i = 0; i < matrix.size(); i++) {
			if (i + 1 < matrix.size()) {
				System.out.println("Hasil penjumlahan matriks ke " + (i + 1) + " dan " + (i + 2));
			}
			for (Integer j = 0; j < kolom1; j++) {
				for (Integer j2 = 0; j2 < kolom2; j2++) {
					if (i + 1 < matrix.size()) {
						Integer b = matrix.get(i)[j][j2] + matrix.get(i + 1)[j][j2];
						System.out.print(b + "\t");
					}
				}
				System.out.println();
			}
		}

	}

}
