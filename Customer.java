private double amountFor(Rental aRental) { // Nome alterado de 'each' para 'aRental'
      double result = 0; // Alterado de 'thisAmount' para 'result'
      switch (aRental.getMovie().getPriceCode()) {
         case Movie.REGULAR:
            result += 2;
            if (aRental.getDaysRented() > 2)
               result += (aRental.getDaysRented() - 2) * 1.5;
            break;
         case Movie.NEW_RELEASE:
            result += aRental.getDaysRented() * 3;
            break;
         case Movie.CHILDRENS:
            result += 1.5;
            if (aRental.getDaysRented() > 3)
               result += (aRental.getDaysRented() - 3) * 1.5;
             break;
      }
      return result;
   }