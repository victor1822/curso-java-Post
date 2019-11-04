package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tenha uma boa viagem!");
		Comment c2 = new Comment("Caramba! Que legal!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia!",
				"Estou indo visitar esse pais maravilhoso!", 12);
		p1.addComments(c1);
		p1.addComments(c2);

		System.out.println(p1);

		sc.close();
	}

}
