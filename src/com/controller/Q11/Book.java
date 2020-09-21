package com.controller.Q11;

interface Readable {
	public void readBook();

	public void setBookMark();
}

abstract class Book implements Readable {
	public void readBook() {

	}
}

class EBook extends Book {
	public void readBook() {

	}

	public void setBookMark() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new EBook();
		book1.readBook();

	}

}
