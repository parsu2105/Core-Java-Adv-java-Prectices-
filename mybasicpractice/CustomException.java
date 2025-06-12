// Custom Exception Class
class OverdueBookException extends Exception {
    OverdueBookException(String message) { super(message); }
}

// Using Custom Exception in Library System
class Library {
    void returnBook(int daysLate) throws OverdueBookException {
        if (daysLate > 15) {  // Custom rule for overdue books
            throw new OverdueBookException("Book overdue by " + daysLate + " days! Fine applicable.");
        }
        System.out.println("Book returned successfully.");
    }
}

public class  CustomException{
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.returnBook(20); // ❌ Throws OverdueBookException
        } catch (OverdueBookException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}